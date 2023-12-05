package net.nukebob.elements.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SpiritCandleBlock extends Block {

    private static final VoxelShape SHAPE = Block.createCuboidShape(6, 0, 6, 10, 10, 10);


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {

        return SHAPE;
    }

    public SpiritCandleBlock(Settings settings) {
        super(settings);
    }
}
