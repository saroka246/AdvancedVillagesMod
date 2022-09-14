package com.saroka.advancedvillagemod.blocks.pointsofinterest;



import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class GlassBlowerTable extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 2, 12, 2),
            Block.makeCuboidShape(0, 0, 14, 2, 12, 16),
            Block.makeCuboidShape(14, 0, 0, 16, 12, 2),
            Block.makeCuboidShape(14, 0, 14, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 2, 12, 2),
            Block.makeCuboidShape(0, 0, 14, 2, 12, 16),
            Block.makeCuboidShape(14, 0, 0, 16, 12, 2),
            Block.makeCuboidShape(14, 0, 14, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 2, 12, 2),
            Block.makeCuboidShape(0, 0, 14, 2, 12, 16),
            Block.makeCuboidShape(14, 0, 0, 16, 12, 2),
            Block.makeCuboidShape(14, 0, 14, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 2, 12, 2),
            Block.makeCuboidShape(0, 0, 14, 2, 12, 16),
            Block.makeCuboidShape(14, 0, 0, 16, 12, 2),
            Block.makeCuboidShape(14, 0, 14, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public GlassBlowerTable() {
        super(net.minecraft.block.Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f,15.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .harvestLevel(0)
        );

    }
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().rotateY());
    }
    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.1f;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)){
            case WEST:
                return SHAPE_W;
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            default:
                return SHAPE_N;
        }
    }
}
