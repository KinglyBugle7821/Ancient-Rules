package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.projectk.ancientrules.block.AncientRulesBlocks;

public class AncientRulesModelProvider extends FabricModelProvider {
    public AncientRulesModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(AncientRulesBlocks.CHROME_LOG).log(AncientRulesBlocks.CHROME_LOG).wood(AncientRulesBlocks.CHROME_WOOD);
        blockStateModelGenerator.registerLog(AncientRulesBlocks.STRIPPED_CHROME_LOG).log(AncientRulesBlocks.STRIPPED_CHROME_LOG).wood(AncientRulesBlocks.STRIPPED_CHROME_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(AncientRulesBlocks.CHROME_PLANKS);
        blockStateModelGenerator.registerSingleton(AncientRulesBlocks.CHROME_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(AncientRulesBlocks.CHROME_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
