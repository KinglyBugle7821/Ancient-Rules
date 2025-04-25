package net.projectk.ancientrules;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientRules implements ModInitializer {
	public static final String MOD_ID = "ancient-rules";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AncientRulesGroups.registerItemGroup();

		AncientRulesBlocks.registerModBlocks();

		StrippableBlockRegistry.register(AncientRulesBlocks.CHROME_LOG, AncientRulesBlocks.STRIPPED_CHROME_LOG);
		StrippableBlockRegistry.register(AncientRulesBlocks.CHROME_WOOD, AncientRulesBlocks.STRIPPED_CHROME_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROME_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROME_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.STRIPPED_CHROME_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.STRIPPED_CHROME_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROME_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROME_LEAVES, 30, 60);
	}
}