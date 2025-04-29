package net.projectk.ancientrules.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.projectk.ancientrules.AncientRules;
import net.projectk.ancientrules.block.AncientRulesBlocks;

public class AncientRulesConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHROMEWOOD_KEY = registerKey("chromewood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){

        register(context, CHROMEWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(AncientRulesBlocks.CHROMEWOOD_LOG),
                new ForkingTrunkPlacer(5, 4, 3),

                BlockStateProvider.of(AncientRulesBlocks.CHROMEWOOD_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), ConstantIntProvider.create(5), 0.5f, 0.7f, 0.6f, 0.3f),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AncientRules.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context ,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
