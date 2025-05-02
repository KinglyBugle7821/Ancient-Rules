package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.item.AncientRulesItems;
import net.projectk.ancientrules.misc.AncientRulesTags;

import java.util.concurrent.CompletableFuture;

public class AncientRulesItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AncientRulesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(AncientRulesBlocks.CHROMEWOOD_LOG.asItem())
                .add(AncientRulesBlocks.CHROMEWOOD_WOOD.asItem())
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG.asItem())
                .add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(AncientRulesBlocks.CHROMEWOOD_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.SAND)
                .add(AncientRulesBlocks.EVERNIGHT_SAND.asItem());
        getOrCreateTagBuilder(AncientRulesTags.Items.MAGNETIZED)
                .add(AncientRulesItems.MAGNETIZED_IRON_INGOT)
                .add(AncientRulesItems.MAGNETIZED_IRON_NUGGET);
    }
}
