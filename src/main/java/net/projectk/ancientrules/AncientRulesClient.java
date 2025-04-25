package net.projectk.ancientrules;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.projectk.ancientrules.block.AncientRulesBlocks;

public class AncientRulesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AncientRulesBlocks.CHROME_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AncientRulesBlocks.CHROME_LEAVES, RenderLayer.getCutout());
    }
}
