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
        BlockStateModelGenerator.BlockTexturePool chromePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientRulesBlocks.CHROMEWOOD_PLANKS);

        blockStateModelGenerator.registerLog(AncientRulesBlocks.CHROMEWOOD_LOG).log(AncientRulesBlocks.CHROMEWOOD_LOG).wood(AncientRulesBlocks.CHROMEWOOD_WOOD);
        blockStateModelGenerator.registerLog(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG).log(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG).wood(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);

        blockStateModelGenerator.registerSingleton(AncientRulesBlocks.CHROMEWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(AncientRulesBlocks.CHROMEWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        chromePlanksPool.slab(AncientRulesBlocks.CHROMEWOOD_SLAB);
        chromePlanksPool.stairs(AncientRulesBlocks.CHROMEWOOD_STAIRS);
        chromePlanksPool.button(AncientRulesBlocks.CHROMEWOOD_BUTTON);
        chromePlanksPool.pressurePlate(AncientRulesBlocks.CHROMEWOOD_PRESSURE_PLATE);
        chromePlanksPool.fence(AncientRulesBlocks.CHROMEWOOD_FENCE);
        chromePlanksPool.fenceGate(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(AncientRulesBlocks.CHROMEWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
