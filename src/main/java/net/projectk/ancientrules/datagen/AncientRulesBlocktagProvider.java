package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.misc.AncientRulesTags;

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

        getOrCreateTagBuilder(AncientRulesTags.Blocks.LED_PANELS)
                .add(AncientRulesBlocks.RED_LED_PANEL)
                .add(AncientRulesBlocks.BLUE_LED_PANEL)
                .add(AncientRulesBlocks.YELLOW_LED_PANEL)
                .add(AncientRulesBlocks.GREEN_LED_PANEL)
                .add(AncientRulesBlocks.BLACK_LED_PANEL)
                .add(AncientRulesBlocks.WHITE_LED_PANEL)
                .add(AncientRulesBlocks.ORANGE_LED_PANEL)
                .add(AncientRulesBlocks.PURPLE_LED_PANEL)
                .add(AncientRulesBlocks.LIGHT_BLUE_LED_PANEL)
                .add(AncientRulesBlocks.LIME_LED_PANEL)
                .add(AncientRulesBlocks.PINK_LED_PANEL)
                .add(AncientRulesBlocks.GRAY_LED_PANEL)
                .add(AncientRulesBlocks.LIGHT_GRAY_LED_PANEL)
                .add(AncientRulesBlocks.CYAN_LED_PANEL)
                .add(AncientRulesBlocks.MAGENTA_LED_PANEL)
                .add(AncientRulesBlocks.BROWN_LED_PANEL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AncientRulesBlocks.EVERNIGHT_SANDSTONE)
                .add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_STAIRS)
                .add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB)
                .add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL)
                .add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE)
                .add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_STAIRS)
                .add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_SLAB)
                .add(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE)
                .add(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE_SLAB)
                .add(AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE);
        getOrCreateTagBuilder(BlockTags.SAND).add(AncientRulesBlocks.EVERNIGHT_SAND);
    }
}
