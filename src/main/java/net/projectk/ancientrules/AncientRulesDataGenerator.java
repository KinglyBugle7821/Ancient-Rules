package net.projectk.ancientrules;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.projectk.ancientrules.datagen.*;
import net.projectk.ancientrules.world.AncientRulesConfiguredFeatures;
import net.projectk.ancientrules.world.AncientRulesPlacedFeatures;
import net.projectk.ancientrules.world.biome.AncientRulesBiomes;

public class AncientRulesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(AncientRulesBlocktagProvider::new);
		pack.addProvider(AncientRulesItemTagProvider::new);
		pack.addProvider(AncientRulesLootTableProvider::new);
		pack.addProvider(AncientRulesModelProvider::new);
		pack.addProvider(AncientRulesRecipeProvider::new);
		pack.addProvider(AncientRulesRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AncientRulesConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AncientRulesPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, AncientRulesBiomes::bootstrap);
	}
}
