package net.nukebob.elements.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.advancement.AdvancementsScreen;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class ElementTaskTreeCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("tasks")
                .executes(context -> openElementTaskTree(context.getSource())));
    }

    private static int openElementTaskTree(ServerCommandSource source) {
        source.sendMessage(Text.literal("amongus"));
        return 1;
    }
}
