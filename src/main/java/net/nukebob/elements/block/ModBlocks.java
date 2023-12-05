package net.nukebob.elements.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.nukebob.elements.ElementsSurvival;
import net.nukebob.elements.block.custom.*;

public class ModBlocks {
    public static final Block GULLIBILLIUM_BLOCK = registerBlock("gullibillium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SPIRIT_STONE = registerBlock("spirit_stone",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block SPIRIT_STONE_BRICKS = registerBlock("spirit_stone_bricks",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SPIRIT_STONE_BRICKS = registerBlock("cracked_spirit_stone_bricks",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block DARKENED_SPIRIT_STONE = registerBlock("darkened_spirit_stone",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block DARKENED_SPIRIT_STONE_BRICKS = registerBlock("darkened_spirit_stone_bricks",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block DARKENED_CRACKED_SPIRIT_STONE_BRICKS = registerBlock("darkened_cracked_spirit_stone_bricks",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE)));
    public static final Block SPIRIT_STONE_STAIRS = registerBlock("spirit_stone_stairs",
            new ModStairsBlock(ModBlocks.SPIRIT_STONE.getDefaultState(),
                    FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE)));
    public static final Block SPIRIT_STONE_BRICK_STAIRS = registerBlock("spirit_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.SPIRIT_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE_BRICKS)));
    public static final Block DARKENED_SPIRIT_STONE_STAIRS = registerBlock("darkened_spirit_stone_stairs",
            new ModStairsBlock(ModBlocks.DARKENED_SPIRIT_STONE.getDefaultState(),
                    FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE)));
    public static final Block DARKENED_SPIRIT_STONE_BRICK_STAIRS = registerBlock("darkened_spirit_stone_brick_stairs",
            new ModStairsBlock(ModBlocks.DARKENED_SPIRIT_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE_BRICKS)));
    public static final Block SPIRIT_STONE_WALL = registerBlock("spirit_stone_wall",
            new WallBlock(FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE)));
    public static final Block SPIRIT_STONE_BRICK_WALL = registerBlock("spirit_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE_BRICKS)));
    public static final Block DARKENED_SPIRIT_STONE_WALL = registerBlock("darkened_spirit_stone_wall",
            new WallBlock(FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE)));
    public static final Block DARKENED_SPIRIT_STONE_BRICK_WALL = registerBlock("darkened_spirit_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE_BRICKS)));
    public static final Block SPIRIT_STONE_SLAB = registerBlock("spirit_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE)));
    public static final Block SPIRIT_STONE_BRICK_SLAB = registerBlock("spirit_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(ModBlocks.SPIRIT_STONE_BRICKS)));
    public static final Block DARKENED_SPIRIT_STONE_SLAB = registerBlock("darkened_spirit_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE)));
    public static final Block DARKENED_SPIRIT_STONE_BRICK_SLAB = registerBlock("darkened_spirit_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(ModBlocks.DARKENED_SPIRIT_STONE_BRICKS)));
    public static final Block SPIRIT_IMBUED_SPIRIT_STONE = registerBlock("spirit_imbued_spirit_stone",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block VOID_BLOCK = registerBlock("void_block",
            new Block(FabricBlockSettings.create().collidable(true)));
    public static final Block ETHEREAL_LAMP = registerBlock("ethereal_lamp",
            new Block(FabricBlockSettings.create().luminance(15).nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block SPIRIT_IMBUED_BASALT = registerBlock("spirit_imbued_basalt",
            new SpiritImbuedBasaltBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BASALT)));
    public static final Block SPIRIT_IMBUED_SMOOTH_BASALT = registerBlock("spirit_imbued_smooth_basalt",
            new SpiritImbuedBasaltBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BASALT)));
    public static final Block SPIRIT_INFUSED_BASALT = registerBlock("spirit_infused_basalt",
            new SpiritInfusedBasaltBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BASALT)));
    public static final Block SPIRIT_LAMP = registerBlock("spirit_lamp",
            new Block(FabricBlockSettings.create().luminance(15).sounds(BlockSoundGroup.GLASS)));
    public static final Block SPIRIT_CHAIN = registerBlock("spirit_chain",
            new SpiritChainBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(10)));
    public static final Block SPIRIT_LANTERN = registerBlock("spirit_lantern",
            new SpiritLanternBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.LANTERN).nonOpaque().luminance(10)));
    public static final Block SPIRIT_CANDLE = registerBlock("spirit_candle",
            new SpiritCandleBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CANDLE).luminance(12)));
    public static final Block SPIRIT_TORCH = registerBlock("spirit_torch",
            new TorchBlock( FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).luminance(10).pistonBehavior(PistonBehavior.DESTROY).noCollision(), ParticleTypes.SOUL_FIRE_FLAME));
    public static final Block SPIRIT_WALL_TORCH = registerBlock("spirit_wall_torch",
            new SpiritWallTorchBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).luminance(state -> 10).pistonBehavior(PistonBehavior.DESTROY).noCollision(), ParticleTypes.SOUL_FIRE_FLAME));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(ElementsSurvival.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ElementsSurvival.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ElementsSurvival.LOGGER.info("Registering Modblocks for " + ElementsSurvival.MOD_ID);
    }
}
