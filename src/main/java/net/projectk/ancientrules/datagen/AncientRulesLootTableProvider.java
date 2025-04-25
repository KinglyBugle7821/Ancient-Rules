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
        addDrop(AncientRulesBlocks.CHROME_LOG);
        addDrop(AncientRulesBlocks.CHROME_WOOD);
        addDrop(AncientRulesBlocks.STRIPPED_CHROME_LOG);
        addDrop(AncientRulesBlocks.STRIPPED_CHROME_WOOD);
        addDrop(AncientRulesBlocks.CHROME_PLANKS);
        addDrop(AncientRulesBlocks.CHROME_SAPLING);

        addDrop(AncientRulesBlocks.CHROME_LEAVES, leavesDrops(AncientRulesBlocks.CHROME_LEAVES, AncientRulesBlocks.CHROME_SAPLING, 0.0625F));
    }
}
