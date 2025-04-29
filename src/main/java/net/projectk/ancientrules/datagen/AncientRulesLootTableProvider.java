package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.projectk.ancientrules.block.AncientRulesBlocks;

import java.util.concurrent.CompletableFuture;

public class AncientRulesLootTableProvider extends FabricBlockLootTableProvider {
    public AncientRulesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(AncientRulesBlocks.CHROMEWOOD_LOG);
        addDrop(AncientRulesBlocks.CHROMEWOOD_WOOD);
        addDrop(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG);
        addDrop(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);
        addDrop(AncientRulesBlocks.CHROMEWOOD_PLANKS);
        addDrop(AncientRulesBlocks.CHROMEWOOD_SAPLING);

        addDrop(AncientRulesBlocks.CHROMEWOOD_SLAB);
        addDrop(AncientRulesBlocks.CHROMEWOOD_STAIRS);
        addDrop(AncientRulesBlocks.CHROMEWOOD_BUTTON);
        addDrop(AncientRulesBlocks.CHROMEWOOD_PRESSURE_PLATE);
        addDrop(AncientRulesBlocks.CHROMEWOOD_FENCE);
        addDrop(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE);
        addDrop(AncientRulesBlocks.CHROMEWOOD_DOOR, doorDrops(AncientRulesBlocks.CHROMEWOOD_DOOR));
        addDrop(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR);

        addDrop(AncientRulesBlocks.CHROMEWOOD_LEAVES, leavesDrops(AncientRulesBlocks.CHROMEWOOD_LEAVES, AncientRulesBlocks.CHROMEWOOD_SAPLING, 0.0625F));

        addDrop(AncientRulesBlocks.RED_LED_PANEL);
        addDrop(AncientRulesBlocks.BLUE_LED_PANEL);
        addDrop(AncientRulesBlocks.YELLOW_LED_PANEL);
        addDrop(AncientRulesBlocks.GREEN_LED_PANEL);
        addDrop(AncientRulesBlocks.BLACK_LED_PANEL);
        addDrop(AncientRulesBlocks.WHITE_LED_PANEL);
        addDrop(AncientRulesBlocks.ORANGE_LED_PANEL);
        addDrop(AncientRulesBlocks.PURPLE_LED_PANEL);
        addDrop(AncientRulesBlocks.LIGHT_BLUE_LED_PANEL);
        addDrop(AncientRulesBlocks.LIME_LED_PANEL);
        addDrop(AncientRulesBlocks.PINK_LED_PANEL);
        addDrop(AncientRulesBlocks.GRAY_LED_PANEL);
        addDrop(AncientRulesBlocks.LIGHT_GRAY_LED_PANEL);
        addDrop(AncientRulesBlocks.CYAN_LED_PANEL);
        addDrop(AncientRulesBlocks.MAGENTA_LED_PANEL);
        addDrop(AncientRulesBlocks.BROWN_LED_PANEL);

        addDrop(AncientRulesBlocks.EVERNIGHT_SAND);
        addDrop(AncientRulesBlocks.EVERNIGHT_SANDSTONE);
        addDrop(AncientRulesBlocks.EVERNIGHT_SANDSTONE_STAIRS);
        addDrop(AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB);
        addDrop(AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL);
        addDrop(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE);
        addDrop(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_STAIRS);
        addDrop(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_SLAB);
        addDrop(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE);
        addDrop(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE_SLAB);
        addDrop(AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE);
    }
}
