package net.projectk.ancientrules.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.misc.AncientRulesTags;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MagnetizedIronBlock extends Block {
    public MagnetizedIronBlock(Settings settings) {
        super(settings);
    }

    private boolean isReplaceable(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.SHORT_GRASS ||
                block == Blocks.TALL_GRASS ||
                block == Blocks.FERN ||
                block == Blocks.LARGE_FERN;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        final int radius = 5;

        List<BlockPos> ferroMagnetic = new ArrayList<>();

        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    if (dx == 0 && dy == 0 && dz == 0) continue;

                    BlockPos checkPos = pos.add(dx, dy, dz);
                    if (world.getBlockState(checkPos).isIn(AncientRulesTags.Blocks.FERROMAGNETIC)) {
                        ferroMagnetic.add(checkPos);
                    }
                }
            }
        }

        ferroMagnetic.sort(Comparator.comparingDouble(p -> p.getSquaredDistance(pos)));

        for (BlockPos ironPos : ferroMagnetic) {
            int moveX = Integer.signum(pos.getX() - ironPos.getX());
            int moveY = Integer.signum(pos.getY() - ironPos.getY());
            int moveZ = Integer.signum(pos.getZ() - ironPos.getZ());

            BlockPos nextPos = ironPos.add(moveX, moveY, moveZ);
            BlockState nextState = world.getBlockState(nextPos);

            if (nextState.isAir() || isReplaceable(nextState)) {
                BlockState ironState = world.getBlockState(ironPos);
                world.setBlockState(nextPos, ironState);
                world.removeBlock(ironPos, false);
                break;
            }
        }
        world.scheduleBlockTick(pos, this, 10);
    }
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient) {
            world.scheduleBlockTick(pos, this, 10);
        }
    }
}
