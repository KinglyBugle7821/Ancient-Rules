package net.projectk.ancientrules;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.projectk.ancientrules.datagen.*;

public class AncientRulesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(AncientRulesBlocktagProvider::new);
		pack.addProvider(AncientRulesItemTagProvider::new);
		pack.addProvider(AncientRulesLootTableProvider::new);
		pack.addProvider(AncientRulesModelProvider::new);
		pack.addProvider(AncientRulesRecipeProvider::new);
	}
}
