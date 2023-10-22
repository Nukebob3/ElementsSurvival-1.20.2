package net.nukebob.elements;

import net.fabricmc.api.ModInitializer;

import net.nukebob.elements.item.ModItemGroups;
import net.nukebob.elements.item.ModItems;
import net.nukebob.elements.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementsSurvival implements ModInitializer {
	public static final String MOD_ID = "elements";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModSounds.registerSounds();
	}
}