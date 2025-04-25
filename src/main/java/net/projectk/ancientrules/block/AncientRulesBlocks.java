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

    public static final Block CHROMEWOOD_LOG = registerBlock("chromewood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block CHROMEWOOD_WOOD = registerBlock("chromewood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CHROMEWOOD_LOG = registerBlock("stripped_chromewood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CHROMEWOOD_WOOD = registerBlock("stripped_chromewood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block CHROMEWOOD_PLANKS = registerBlock("chromewood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHROMEWOOD_LEAVES = registerBlock("chromewood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block CHROMEWOOD_SAPLING = registerBlock("chromewood_sapling",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block CHROMEWOOD_SLAB = registerBlock("chromewood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block CHROMEWOOD_STAIRS = registerBlock("chromewood_stairs",
            new StairsBlock(AncientRulesBlocks.CHROMEWOOD_PLANKS.getDefaultState()
                    ,AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));

    public static final Block CHROMEWOOD_BUTTON = registerBlock("chromewood_button",
            new ButtonBlock(BlockSetType.COPPER, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block CHROMEWOOD_PRESSURE_PLATE = registerBlock("chromewood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block CHROMEWOOD_FENCE = registerBlock("chromewood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block CHROMEWOOD_FENCE_GATE = registerBlock("chromewood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

    public static final Block CHROMEWOOD_DOOR = registerBlock("chromewood_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block CHROMEWOOD_TRAPDOOR = registerBlock("chromewood_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

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
