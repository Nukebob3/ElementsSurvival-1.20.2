package net.nukebob.elements.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class SpiritLanternBlock extends Block implements Waterloggable {

    public static final BooleanProperty HANGING = Properties.HANGING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    protected static final VoxelShape STANDING_SHAPE = VoxelShapes.union(Block.createCuboidShape(4, 0, 4, 12, 8, 12), Block.createCuboidShape(4, 0, 4, 12, 8, 12));
    protected static final VoxelShape HANGING_SHAPE = VoxelShapes.union(Block.createCuboidShape(5.0, 1.0, 5.0, 11.0, 8.0, 11.0));

    public SpiritLanternBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HANGING, false)).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(HANGING).booleanValue()) {
            return VoxelShapes.empty();
        }
        return STANDING_SHAPE;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        for (Direction direction : ctx.getPlacementDirections()) {
            BlockState blockState;
            if (direction.getAxis() != Direction.Axis.Y || !(blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP)).canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) continue;
            return (BlockState)blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(HANGING) != false ? HANGING_SHAPE : STANDING_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HANGING, WATERLOGGED);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = SpiritLanternBlock.attachedDirection(state).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }

    protected static Direction attachedDirection(BlockState state) {
        return state.get(HANGING) != false ? Direction.DOWN : Direction.UP;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return !state.get(HANGING);
    }
}
