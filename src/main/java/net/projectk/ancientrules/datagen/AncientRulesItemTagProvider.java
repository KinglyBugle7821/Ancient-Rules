package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.projectk.ancientrules.block.AncientRulesBlocks;

import java.util.concurrent.CompletableFuture;

public class AncientRulesItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AncientRulesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(AncientRulesBlocks.CHROME_LOG.asItem())
                .add(AncientRulesBlocks.CHROME_WOOD.asItem())
                .add(AncientRulesBlocks.STRIPPED_CHROME_LOG.asItem())
                .add(AncientRulesBlocks.STRIPPED_CHROME_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(AncientRulesBlocks.CHROME_PLANKS.asItem());

    }
}
