package net.projectk.ancientrules.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class LEDPanelBlock extends FacingBlock {
    public static final MapCodec<LEDPanelBlock> CODEC = createCodec(LEDPanelBlock::new);

    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0, 0, 15, 16, 16, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0, 0, 0, 16, 16, 1);
    private static final VoxelShape SHAPE_EAST  = Block.createCuboidShape(0, 0, 0, 1, 16, 16);
    private static final VoxelShape SHAPE_WEST  = Block.createCuboidShape(15, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_UP    = Block.createCuboidShape(0, 0, 0, 16, 1, 16);   // On ceiling
    private static final VoxelShape SHAPE_DOWN  = Block.createCuboidShape(0, 15, 0, 16, 16, 16); // On floor

    public LEDPanelBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST  -> SHAPE_EAST;
            case WEST  -> SHAPE_WEST;
            case UP    -> SHAPE_UP;
            case DOWN  -> SHAPE_DOWN;
        };
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos adjacentPos = pos.offset(state.get(FACING).getOpposite());
        BlockState adjacentState = world.getBlockState(adjacentPos);

        return adjacentState.isSolidBlock(world, adjacentPos);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getSide());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected MapCodec<? extends FacingBlock> getCodec() {
        return CODEC;
    }
}
