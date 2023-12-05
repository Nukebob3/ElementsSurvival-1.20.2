package net.nukebob.elements;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nukebob.elements.block.ModBlocks;
import net.nukebob.elements.event.KeyInputHandler;

public class ElementsSurvivalClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIRIT_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ETHEREAL_LAMP, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIRIT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIRIT_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIRIT_WALL_TORCH, RenderLayer.getCutout());
    }
}
