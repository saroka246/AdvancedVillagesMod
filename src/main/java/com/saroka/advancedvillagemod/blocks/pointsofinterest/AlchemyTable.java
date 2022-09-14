package com.saroka.advancedvillagemod.blocks.pointsofinterest;

import net.minecraft.block.*;
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

public class AlchemyTable extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of( Block.makeCuboidShape(6, 19.25, 12.5, 7, 20.5, 13.5), Block.makeCuboidShape(6, 19, 12.5, 7, 19.25, 13.5), Block.makeCuboidShape(6, 19.25, 12.25, 7, 21.25, 12.5), Block.makeCuboidShape(6, 19.25, 13.5, 7, 21.25, 13.75), Block.makeCuboidShape(5.75, 19.25, 12.5, 6, 21.25, 13.5), Block.makeCuboidShape(7, 19.25, 12.5, 7.25, 21.25, 13.5), Block.makeCuboidShape(6, 21.25, 12.5, 7, 21.5, 12.75), Block.makeCuboidShape(6, 21.25, 13.25, 7, 21.5, 13.5), Block.makeCuboidShape(6, 21.25, 12.75, 6.25, 21.5, 13.25), Block.makeCuboidShape(6.75, 21.25, 12.75, 7, 21.5, 13.25), Block.makeCuboidShape(6.25, 21.5, 12.75, 6.75, 22.5, 13.25), Block.makeCuboidShape(6, 22.5, 12.75, 6.25, 22.75, 13.25), Block.makeCuboidShape(6.25, 22.5, 13.25, 6.75, 22.75, 13.5), Block.makeCuboidShape(6.25, 22.5, 12.5, 6.75, 22.75, 12.75), Block.makeCuboidShape(6.75, 22.5, 12.75, 7, 22.75, 13.25), Block.makeCuboidShape(3.25, 19.25, 12.25, 4.75, 20.25, 13.75), Block.makeCuboidShape(3.25, 21.75, 12.25, 4.75, 22.5, 13.75), Block.makeCuboidShape(4.5, 19, 12.5, 5, 22, 13.5), Block.makeCuboidShape(3, 19, 12, 5, 22, 12.5), Block.makeCuboidShape(3, 19, 13.5, 5, 22, 14), Block.makeCuboidShape(3, 19, 12.5, 3.5, 22, 13.5), Block.makeCuboidShape(1, 16, 11, 2, 20, 15), Block.makeCuboidShape(2, 18, 11, 8, 19, 15), Block.makeCuboidShape(8, 16, 11, 9, 20, 15), Block.makeCuboidShape(4, 17, 7, 6, 19, 9), Block.makeCuboidShape(10, 16, 10, 15, 21, 15), Block.makeCuboidShape(11, 21, 11, 14, 23, 14), Block.makeCuboidShape(0, 14, 0, 16, 15, 16), Block.makeCuboidShape(0, 15, 0, 7, 16, 16), Block.makeCuboidShape(7, 15, 0, 9, 16, 7), Block.makeCuboidShape(9, 15, 0, 16, 16, 16), Block.makeCuboidShape(7, 15, 9, 9, 16, 16), Block.makeCuboidShape(4.5, 16, 7.5, 5.5, 17, 8.5), Block.makeCuboidShape(2, 0, 2, 4, 14, 5), Block.makeCuboidShape(1, 0, 13, 4, 14, 15), Block.makeCuboidShape(12, 0, 13, 15, 14, 15), Block.makeCuboidShape(12, 0, 2, 14, 14, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_S = Stream.of( Block.makeCuboidShape(9, 19.25, 2.5, 10, 20.5, 3.5), Block.makeCuboidShape(9, 19, 2.5, 10, 19.25, 3.5), Block.makeCuboidShape(9, 19.25, 3.5, 10, 21.25, 3.75), Block.makeCuboidShape(9, 19.25, 2.25, 10, 21.25, 2.5), Block.makeCuboidShape(10, 19.25, 2.5, 10.25, 21.25, 3.5), Block.makeCuboidShape(8.75, 19.25, 2.5, 9, 21.25, 3.5), Block.makeCuboidShape(9, 21.25, 3.25, 10, 21.5, 3.5), Block.makeCuboidShape(9, 21.25, 2.5, 10, 21.5, 2.75), Block.makeCuboidShape(9.75, 21.25, 2.75, 10, 21.5, 3.25), Block.makeCuboidShape(9, 21.25, 2.75, 9.25, 21.5, 3.25), Block.makeCuboidShape(9.25, 21.5, 2.75, 9.75, 22.5, 3.25), Block.makeCuboidShape(9.75, 22.5, 2.75, 10, 22.75, 3.25), Block.makeCuboidShape(9.25, 22.5, 2.5, 9.75, 22.75, 2.75), Block.makeCuboidShape(9.25, 22.5, 3.25, 9.75, 22.75, 3.5), Block.makeCuboidShape(9, 22.5, 2.75, 9.25, 22.75, 3.25), Block.makeCuboidShape(11.25, 19.25, 2.25, 12.75, 20.25, 3.75), Block.makeCuboidShape(11.25, 21.75, 2.25, 12.75, 22.5, 3.75), Block.makeCuboidShape(11, 19, 2.5, 11.5, 22, 3.5), Block.makeCuboidShape(11, 19, 3.5, 13, 22, 4), Block.makeCuboidShape(11, 19, 2, 13, 22, 2.5), Block.makeCuboidShape(12.5, 19, 2.5, 13, 22, 3.5), Block.makeCuboidShape(14, 16, 1, 15, 20, 5), Block.makeCuboidShape(8, 18, 1, 14, 19, 5), Block.makeCuboidShape(7, 16, 1, 8, 20, 5), Block.makeCuboidShape(10, 17, 7, 12, 19, 9), Block.makeCuboidShape(1, 16, 1, 6, 21, 6), Block.makeCuboidShape(2, 21, 2, 5, 23, 5), Block.makeCuboidShape(0, 14, 0, 16, 15, 16), Block.makeCuboidShape(9, 15, 0, 16, 16, 16), Block.makeCuboidShape(7, 15, 9, 9, 16, 16), Block.makeCuboidShape(0, 15, 0, 7, 16, 16), Block.makeCuboidShape(7, 15, 0, 9, 16, 7), Block.makeCuboidShape(10.5, 16, 7.5, 11.5, 17, 8.5), Block.makeCuboidShape(12, 0, 11, 14, 14, 14), Block.makeCuboidShape(12, 0, 1, 15, 14, 3), Block.makeCuboidShape(1, 0, 1, 4, 14, 3), Block.makeCuboidShape(2, 0, 11, 4, 14, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_E = Stream.of(Block.makeCuboidShape(2.5, 19.25, 6, 3.5, 20.5, 7), Block.makeCuboidShape(2.5, 19, 6, 3.5, 19.25, 7), Block.makeCuboidShape(3.5, 19.25, 6, 3.75, 21.25, 7), Block.makeCuboidShape(2.25, 19.25, 6, 2.5, 21.25, 7), Block.makeCuboidShape(2.5, 19.25, 5.75, 3.5, 21.25, 6), Block.makeCuboidShape(2.5, 19.25, 7, 3.5, 21.25, 7.25), Block.makeCuboidShape(3.25, 21.25, 6, 3.5, 21.5, 7), Block.makeCuboidShape(2.5, 21.25, 6, 2.75, 21.5, 7), Block.makeCuboidShape(2.75, 21.25, 6, 3.25, 21.5, 6.25), Block.makeCuboidShape(2.75, 21.25, 6.75, 3.25, 21.5, 7), Block.makeCuboidShape(2.75, 21.5, 6.25, 3.25, 22.5, 6.75), Block.makeCuboidShape(2.75, 22.5, 6, 3.25, 22.75, 6.25), Block.makeCuboidShape(2.5, 22.5, 6.25, 2.75, 22.75, 6.75), Block.makeCuboidShape(3.25, 22.5, 6.25, 3.5, 22.75, 6.75), Block.makeCuboidShape(2.75, 22.5, 6.75, 3.25, 22.75, 7), Block.makeCuboidShape(2.25, 19.25, 3.25, 3.75, 20.25, 4.75), Block.makeCuboidShape(2.25, 21.75, 3.25, 3.75, 22.5, 4.75), Block.makeCuboidShape(2.5, 19, 4.5, 3.5, 22, 5), Block.makeCuboidShape(3.5, 19, 3, 4, 22, 5), Block.makeCuboidShape(2, 19, 3, 2.5, 22, 5), Block.makeCuboidShape(2.5, 19, 3, 3.5, 22, 3.5), Block.makeCuboidShape(1, 16, 1, 5, 20, 2), Block.makeCuboidShape(1, 18, 2, 5, 19, 8), Block.makeCuboidShape(1, 16, 8, 5, 20, 9), Block.makeCuboidShape(7, 17, 4, 9, 19, 6), Block.makeCuboidShape(1, 16, 10, 6, 21, 15), Block.makeCuboidShape(2, 21, 11, 5, 23, 14), Block.makeCuboidShape(0, 14, 0, 16, 15, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 7), Block.makeCuboidShape(9, 15, 7, 16, 16, 9), Block.makeCuboidShape(0, 15, 9, 16, 16, 16), Block.makeCuboidShape(0, 15, 7, 7, 16, 9), Block.makeCuboidShape(7.5, 16, 4.5, 8.5, 17, 5.5), Block.makeCuboidShape(11, 0, 2, 14, 14, 4), Block.makeCuboidShape(1, 0, 1, 3, 14, 4), Block.makeCuboidShape(1, 0, 12, 3, 14, 15), Block.makeCuboidShape(11, 0, 12, 14, 14, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(12.5, 19.25, 9, 13.5, 20.5, 10), Block.makeCuboidShape(12.5, 19, 9, 13.5, 19.25, 10), Block.makeCuboidShape(12.25, 19.25, 9, 12.5, 21.25, 10), Block.makeCuboidShape(13.5, 19.25, 9, 13.75, 21.25, 10), Block.makeCuboidShape(12.5, 19.25, 10, 13.5, 21.25, 10.25), Block.makeCuboidShape(12.5, 19.25, 8.75, 13.5, 21.25, 9), Block.makeCuboidShape(12.5, 21.25, 9, 12.75, 21.5, 10), Block.makeCuboidShape(13.25, 21.25, 9, 13.5, 21.5, 10), Block.makeCuboidShape(12.75, 21.25, 9.75, 13.25, 21.5, 10), Block.makeCuboidShape(12.75, 21.25, 9, 13.25, 21.5, 9.25), Block.makeCuboidShape(12.75, 21.5, 9.25, 13.25, 22.5, 9.75), Block.makeCuboidShape(12.75, 22.5, 9.75, 13.25, 22.75, 10), Block.makeCuboidShape(13.25, 22.5, 9.25, 13.5, 22.75, 9.75), Block.makeCuboidShape(12.5, 22.5, 9.25, 12.75, 22.75, 9.75), Block.makeCuboidShape(12.75, 22.5, 9, 13.25, 22.75, 9.25), Block.makeCuboidShape(12.25, 19.25, 11.25, 13.75, 20.25, 12.75), Block.makeCuboidShape(12.25, 21.75, 11.25, 13.75, 22.5, 12.75), Block.makeCuboidShape(12.5, 19, 11, 13.5, 22, 11.5), Block.makeCuboidShape(12, 19, 11, 12.5, 22, 13), Block.makeCuboidShape(13.5, 19, 11, 14, 22, 13), Block.makeCuboidShape(12.5, 19, 12.5, 13.5, 22, 13), Block.makeCuboidShape(11, 16, 14, 15, 20, 15), Block.makeCuboidShape(11, 18, 8, 15, 19, 14), Block.makeCuboidShape(11, 16, 7, 15, 20, 8), Block.makeCuboidShape(7, 17, 10, 9, 19, 12), Block.makeCuboidShape(10, 16, 1, 15, 21, 6), Block.makeCuboidShape(11, 21, 2, 14, 23, 5), Block.makeCuboidShape(0, 14, 0, 16, 15, 16), Block.makeCuboidShape(0, 15, 9, 16, 16, 16), Block.makeCuboidShape(0, 15, 7, 7, 16, 9), Block.makeCuboidShape(0, 15, 0, 16, 16, 7), Block.makeCuboidShape(9, 15, 7, 16, 16, 9), Block.makeCuboidShape(7.5, 16, 10.5, 8.5, 17, 11.5), Block.makeCuboidShape(2, 0, 12, 5, 14, 14), Block.makeCuboidShape(13, 0, 12, 15, 14, 15), Block.makeCuboidShape(13, 0, 1, 15, 14, 4), Block.makeCuboidShape(2, 0, 2, 5, 14, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    public AlchemyTable() {
        super(Block.Properties.create(Material.ROCK)
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
