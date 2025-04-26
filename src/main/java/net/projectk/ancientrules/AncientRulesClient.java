package net.projectk.ancientrules;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.projectk.ancientrules.block.AncientRulesBlocks;


public class AncientRulesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AncientRulesBlocks.CHROMEWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AncientRulesBlocks.CHROMEWOOD_LEAVES, RenderLayer.getCutout());

        BuiltinItemRendererRegistry.INSTANCE.register(AncientRulesBlocks.WHITE_LED_PANEL, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            ItemRenderer itemRenderer = client.getItemRenderer();
            BakedModel model = itemRenderer.getModel(stack, client.world, client.player, 0);

            int fullBrightness = LightmapTextureManager.MAX_LIGHT_COORDINATE;

            itemRenderer.renderItem(stack, mode, fullBrightness, overlay, matrices, vertexConsumers, client.world,0
            );
        });

    }

}
