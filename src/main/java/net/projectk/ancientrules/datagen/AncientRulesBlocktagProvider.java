package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.projectk.ancientrules.block.AncientRulesBlocks;

import java.util.concurrent.CompletableFuture;

public class AncientRulesBlocktagProvider extends FabricTagProvider.BlockTagProvider {
    public AncientRulesBlocktagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(AncientRulesBlocks.CHROME_LOG)
                .add(AncientRulesBlocks.CHROME_WOOD)
                .add(AncientRulesBlocks.STRIPPED_CHROME_LOG)
                .add(AncientRulesBlocks.STRIPPED_CHROME_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(AncientRulesBlocks.CHROME_LOG)
                .add(AncientRulesBlocks.CHROME_WOOD)
                .add(AncientRulesBlocks.STRIPPED_CHROME_LOG)
                .add(AncientRulesBlocks.STRIPPED_CHROME_WOOD);
    }
}
