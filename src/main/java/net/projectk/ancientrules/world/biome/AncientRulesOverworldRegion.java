package net.projectk.ancientrules.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class AncientRulesOverworldRegion extends Region {
    public AncientRulesOverworldRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
//        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
//            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, AncientRulesBiomes.EVERNIGHT_BIOME);
//            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, AncientRulesBiomes.EVERNIGHT_BIOME);
//            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FLOWER_FOREST, AncientRulesBiomes.EVERNIGHT_BIOME);
//            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SUNFLOWER_PLAINS, AncientRulesBiomes.EVERNIGHT_BIOME);
//        });

        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();

        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.COOL)
                .humidity(ParameterUtils.Humidity.DRY)
                .continentalness(ParameterUtils.Continentalness.FAR_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_3)
                .depth(ParameterUtils.Depth.SURFACE)
                .weirdness(ParameterUtils.Weirdness.LOW_SLICE_NORMAL_DESCENDING)
                .build().forEach(point -> builder.add(point, AncientRulesBiomes.EVERNIGHT_BIOME));

        builder.build().forEach(mapper::accept);
    }
}
