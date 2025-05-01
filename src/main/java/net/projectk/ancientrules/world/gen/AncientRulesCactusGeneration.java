package net.projectk.ancientrules.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.projectk.ancientrules.world.AncientRulesPlacedFeatures;
import net.projectk.ancientrules.world.biome.AncientRulesBiomes;

public class AncientRulesCactusGeneration {
    public static void generateCactus(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(AncientRulesBiomes.EVERNIGHT_BIOME),
                GenerationStep.Feature.VEGETAL_DECORATION, AncientRulesPlacedFeatures.EVERNIGHT_CACTUS_PLACED_KEY);
    }
}
