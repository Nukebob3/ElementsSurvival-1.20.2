package net.nukebob.elements.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nukebob.elements.ElementsSurvival;
import net.nukebob.elements.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ELEMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ElementsSurvival.MOD_ID, "elements"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.elements"))
                    .icon(() -> new ItemStack(ModItems.ELEMENT_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ELEMENT_STONE);
                        entries.add(ModItems.AMONGUS);
                        entries.add(ModBlocks.GULLIBILLIUM_BLOCK);

                        entries.add(ModBlocks.SPIRIT_STONE);
                        entries.add(ModBlocks.SPIRIT_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_SPIRIT_STONE_BRICKS);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_BRICKS);
                        entries.add(ModBlocks.DARKENED_CRACKED_SPIRIT_STONE_BRICKS);
                        entries.add(ModBlocks.SPIRIT_IMBUED_SPIRIT_STONE);
                        entries.add(ModBlocks.VOID_BLOCK);
                        entries.add(ModBlocks.ETHEREAL_LAMP);
                        entries.add(ModBlocks.SPIRIT_IMBUED_BASALT);
                        entries.add(ModBlocks.SPIRIT_IMBUED_SMOOTH_BASALT);
                        entries.add(ModBlocks.SPIRIT_INFUSED_BASALT);
                        entries.add(ModBlocks.SPIRIT_LAMP);
                        entries.add(ModBlocks.SPIRIT_CHAIN);
                        entries.add(ModBlocks.SPIRIT_LANTERN);
                        entries.add(ModBlocks.SPIRIT_CANDLE);
                        entries.add(ModBlocks.SPIRIT_TORCH);
                        entries.add(ModBlocks.SPIRIT_WALL_TORCH);
                        entries.add(ModBlocks.SPIRIT_STONE_STAIRS);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_STAIRS);
                        entries.add(ModBlocks.SPIRIT_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.SPIRIT_STONE_WALL);
                        entries.add(ModBlocks.SPIRIT_STONE_BRICK_WALL);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_WALL);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_BRICK_WALL);
                        entries.add(ModBlocks.SPIRIT_STONE_SLAB);
                        entries.add(ModBlocks.SPIRIT_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_SLAB);
                        entries.add(ModBlocks.DARKENED_SPIRIT_STONE_BRICK_SLAB);
                    }).build());

    public static void registerItemGroups() {
        ElementsSurvival.LOGGER.info("Registering item groups for "+ElementsSurvival.MOD_ID);
    }
}
