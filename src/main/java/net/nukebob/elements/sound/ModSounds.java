package net.nukebob.elements.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.nukebob.elements.ElementsSurvival;

public class ModSounds {
    public static final SoundEvent AMONGUS_SUS = registerSoundEvent("amongus_sus");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ElementsSurvival.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        ElementsSurvival.LOGGER.info("Registering Sounds for" + ElementsSurvival.MOD_ID);
    }
}
