package net.projectk.ancientrules.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;
import net.projectk.ancientrules.block.AncientRulesBlocks;

public class EvernightCactusBlock extends CactusBlock {
    public EvernightCactusBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        for(Direction direction : Direction.Type.HORIZONTAL) {
            BlockState blockState = world.getBlockState(pos.offset(direction));
            if (blockState.isSolid() || world.getFluidState(pos.offset(direction)).isIn(FluidTags.LAVA)) {
                return false;
            }
        }

        BlockState blockState2 = world.getBlockState(pos.down());
        return (blockState2.isOf(AncientRulesBlocks.EVERNIGHT_SAND) || blockState2.isOf(AncientRulesBlocks.EVERNIGHT_CACTUS)) && !world.getBlockState(pos.up()).isLiquid();
    }
}
