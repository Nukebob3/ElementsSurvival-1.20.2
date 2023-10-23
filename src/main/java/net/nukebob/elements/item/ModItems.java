package net.nukebob.elements.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nukebob.elements.ElementsSurvival;
import net.nukebob.elements.item.custom.AmongusItem;
import net.nukebob.elements.item.custom.ElementStoneItem;

public class ModItems {
    public static final Item ELEMENT_STONE = registerItem("element_stone",
            new ElementStoneItem(new FabricItemSettings().maxCount(1)));
    public static final Item AMONGUS = registerItem("amongus",
            new AmongusItem(new FabricItemSettings().maxCount(1)));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        //entries.add(ELEMENT_STONE);
        //entries.add(AMONGUS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ElementsSurvival.MOD_ID, name),item);
    }

    public static void registerModItems() {
        ElementsSurvival.LOGGER.info("Registering Mod Items for "+ElementsSurvival.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
