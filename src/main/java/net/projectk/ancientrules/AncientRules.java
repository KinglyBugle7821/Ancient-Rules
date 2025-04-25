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

		StrippableBlockRegistry.register(AncientRulesBlocks.CHROMEWOOD_LOG, AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG);
		StrippableBlockRegistry.register(AncientRulesBlocks.CHROMEWOOD_WOOD, AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE, 5, 20);
	}
}