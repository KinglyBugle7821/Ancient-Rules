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
                .add(AncientRulesBlocks.CHROMEWOOD_LOG)
                .add(AncientRulesBlocks.CHROMEWOOD_WOOD)
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG)
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(AncientRulesBlocks.CHROMEWOOD_LOG)
                .add(AncientRulesBlocks.CHROMEWOOD_WOOD)
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG)
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);
        getOrCreateTagBuilder(BlockTags.FENCES).add(AncientRulesBlocks.CHROMEWOOD_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(AncientRulesBlocks.CHROMEWOOD_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(AncientRulesBlocks.CHROMEWOOD_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(AncientRulesBlocks.CHROMEWOOD_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(AncientRulesBlocks.CHROMEWOOD_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(AncientRulesBlocks.CHROMEWOOD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DOORS).add(AncientRulesBlocks.CHROMEWOOD_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR);
    }
}
