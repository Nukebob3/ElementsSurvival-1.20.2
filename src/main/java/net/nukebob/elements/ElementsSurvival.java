package net.nukebob.elements;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.nukebob.elements.block.ModBlocks;
import net.nukebob.elements.command.ElementTaskTreeCommand;
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
		ModBlocks.registerModBlocks();

		CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {
			ElementTaskTreeCommand.register(dispatcher);
		}));
	}
}