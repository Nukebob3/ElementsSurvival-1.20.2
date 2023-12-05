package net.nukebob.elements.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Arm;
import net.nukebob.elements.ElementsSurvival;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_ELEMENTS = "key.elements.category.elements";
    public static final String KEY_PRIMARY_ABILITY = "key.elements.primary_ability";
    public static final String KEY_SECONDARY_ABILITY = "key.elements.secondary_ability";
    public static final String KEY_TERTIARY_ABILITY = "key.elements.tertiary_ability";

    public static KeyBinding primaryAbilityKey;
    public static KeyBinding secondaryAbilityKey;
    public static KeyBinding tertiaryAbilityKey;

    public static void registerKeyInputs() {
        ElementsSurvival.LOGGER.info("Registering Key binds for "+ElementsSurvival.MOD_ID);
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (primaryAbilityKey.wasPressed()) {
                //This happens when key is pressed
                client.player.sendMessage(Text.literal("primary key"));
            }
            if (secondaryAbilityKey.wasPressed()) {
                //This happens when key is pressed
                client.player.sendMessage(Text.literal("secondary key"));
            }
            if (tertiaryAbilityKey.wasPressed()) {
                //This happens when key is pressed
                client.player.sendMessage(Text.literal("tertiary key"));
            }
        });
    }

    public static void register() {
        primaryAbilityKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_PRIMARY_ABILITY,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                    KEY_CATEGORY_ELEMENTS
        ));
        secondaryAbilityKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SECONDARY_ABILITY,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_X,
                KEY_CATEGORY_ELEMENTS
        ));
        tertiaryAbilityKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_TERTIARY_ABILITY,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_C,
                KEY_CATEGORY_ELEMENTS
        ));

        registerKeyInputs();
    }
}
