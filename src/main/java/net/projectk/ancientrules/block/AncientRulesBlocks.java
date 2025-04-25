package net.projectk.ancientrules.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.AncientRules;

public class AncientRulesBlocks {

    public static final Block CHROME_LOG = registerBlock("chrome_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block CHROME_WOOD = registerBlock("chrome_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CHROME_LOG = registerBlock("stripped_chrome_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CHROME_WOOD = registerBlock("stripped_chrome_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block CHROME_PLANKS = registerBlock("chrome_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHROME_LEAVES = registerBlock("chrome_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block CHROME_SAPLING = registerBlock("chrome_sapling",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AncientRules.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AncientRules.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AncientRules.LOGGER.info("Registering Mod Blocks for " + AncientRules.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(AncientRulesBlocks.PINK_GARNET_BLOCK);
//            entries.add(AncientRulesBlocks.RAW_PINK_GARNET_BLOCK);
        });
    }
}
