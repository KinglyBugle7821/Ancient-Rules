package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.projectk.ancientrules.block.AncientRulesBlocks;


public class AncientRulesModelProvider extends FabricModelProvider {
    public AncientRulesModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(AncientRulesBlocks.CHROMEWOOD_LOG).log(AncientRulesBlocks.CHROMEWOOD_LOG).wood(AncientRulesBlocks.CHROMEWOOD_WOOD);
        blockStateModelGenerator.registerLog(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG).log(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG).wood(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);

        blockStateModelGenerator.registerSingleton(AncientRulesBlocks.CHROMEWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(AncientRulesBlocks.CHROMEWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AncientRulesBlocks.CHROMEWOOD_PLANKS)
                .stairs(AncientRulesBlocks.CHROMEWOOD_STAIRS)
                .slab(AncientRulesBlocks.CHROMEWOOD_SLAB)
                .button(AncientRulesBlocks.CHROMEWOOD_BUTTON)
                .pressurePlate(AncientRulesBlocks.CHROMEWOOD_PRESSURE_PLATE)
                .fence(AncientRulesBlocks.CHROMEWOOD_FENCE)
                .fenceGate(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(AncientRulesBlocks.CHROMEWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE);
        blockStateModelGenerator.registerSingleton(AncientRulesBlocks.EVERNIGHT_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AncientRulesBlocks.CHROMEWOOD_SAPLING.asItem(), Models.GENERATED);
    }
}
