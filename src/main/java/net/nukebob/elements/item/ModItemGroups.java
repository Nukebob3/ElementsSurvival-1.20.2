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
                    }).build());

    public static void registerItemGroups() {
        ElementsSurvival.LOGGER.info("Registering item groups for "+ElementsSurvival.MOD_ID);
    }
}
