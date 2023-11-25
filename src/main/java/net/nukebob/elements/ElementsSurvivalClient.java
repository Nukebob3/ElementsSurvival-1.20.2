package net.nukebob.elements;

import net.fabricmc.api.ClientModInitializer;
import net.nukebob.elements.event.KeyInputHandler;

public class ElementsSurvivalClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
