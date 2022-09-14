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

public class ChoppingBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 6, 1, 31, 10),
            Block.makeCuboidShape(15, 12, 6, 16, 31, 10),
            Block.makeCuboidShape(0, 31, 5, 16, 32, 11),
            Block.makeCuboidShape(1, 25, 7, 15, 29, 9),
            Block.makeCuboidShape(1, 23, 7.25, 15, 25, 8.75),
            Block.makeCuboidShape(7, 29, 7.25, 9, 31, 8.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 12, 16),
            Block.makeCuboidShape(0, 12, 6, 1, 31, 10),
            Block.makeCuboidShape(15, 12, 6, 16, 31, 10),
            Block.makeCuboidShape(0, 31, 5, 16, 32, 11),
            Block.makeCuboidShape(1, 25, 7, 15, 29, 9),
            Block.makeCuboidShape(1, 23, 7.25, 15, 25, 8.75),
            Block.makeCuboidShape(7, 29, 7.25, 9, 31, 8.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 12, 16),
            Block.makeCuboidShape(6, 12, 0, 10, 31, 1),
            Block.makeCuboidShape(6, 12, 15, 10, 31, 16),
            Block.makeCuboidShape(5, 31, 0, 11, 32, 16),
            Block.makeCuboidShape(7, 25, 1, 9, 29, 15),
            Block.makeCuboidShape(7.25, 23, 1, 8.75, 25, 15),
            Block.makeCuboidShape(7.25, 29, 7, 8.75, 31, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 12, 16),
            Block.makeCuboidShape(6, 12, 0, 10, 31, 1),
            Block.makeCuboidShape(6, 12, 15, 10, 31, 16),
            Block.makeCuboidShape(5, 31, 0, 11, 32, 16),
            Block.makeCuboidShape(7, 25, 1, 9, 29, 15),
            Block.makeCuboidShape(7.25, 23, 1, 8.75, 25, 15),
            Block.makeCuboidShape(7.25, 29, 7, 8.75, 31, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public ChoppingBlock() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f,15.0f)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD)
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

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.1f;
    }
}
