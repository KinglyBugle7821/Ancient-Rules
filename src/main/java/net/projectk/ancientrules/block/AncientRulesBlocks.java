package net.projectk.ancientrules.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.AncientRules;
import net.projectk.ancientrules.block.custom.EvernightCactusBlock;
import net.projectk.ancientrules.block.custom.LEDPanelBlock;
import net.projectk.ancientrules.block.custom.MagnetizedIronBlock;
import net.projectk.ancientrules.world.tree.AncientRulesSaplingGenerators;

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
            new SaplingBlock(AncientRulesSaplingGenerators.CHROMEWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block CHROMEWOOD_SLAB = registerBlock("chromewood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block CHROMEWOOD_STAIRS = registerBlock("chromewood_stairs",
            new StairsBlock(AncientRulesBlocks.CHROMEWOOD_PLANKS.getDefaultState()
                    ,AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

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

    public static final Block RED_LED_PANEL = registerBlock("red_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.RED).luminance(state -> 9).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_LED_PANEL = registerBlock("blue_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.BLUE).luminance(state -> 7).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_LED_PANEL = registerBlock("yellow_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.YELLOW).luminance(state -> 14).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_LED_PANEL = registerBlock("green_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.GREEN).luminance(state -> 11).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_LED_PANEL = registerBlock("black_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.BLACK).luminance(state -> 4).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_LED_PANEL = registerBlock("white_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.WHITE).luminance(state -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_LED_PANEL = registerBlock("orange_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.ORANGE).luminance(state -> 13).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_LED_PANEL = registerBlock("purple_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.PURPLE).luminance(state -> 8).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_LED_PANEL = registerBlock("light_blue_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.LIGHT_BLUE).luminance(state -> 10).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_LED_PANEL = registerBlock("lime_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.LIME).luminance(state -> 13).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_LED_PANEL = registerBlock("pink_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.PINK).luminance(state -> 12).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_LED_PANEL = registerBlock("gray_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.GRAY).luminance(state -> 6).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_LED_PANEL = registerBlock("light_gray_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.LIGHT_GRAY).luminance(state -> 9).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_LED_PANEL = registerBlock("cyan_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.CYAN).luminance(state -> 9).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_LED_PANEL = registerBlock("magenta_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.MAGENTA).luminance(state -> 10).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_LED_PANEL = registerBlock("brown_led_panel",
            new LEDPanelBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(DyeColor.BROWN).luminance(state -> 5).sounds(BlockSoundGroup.GLASS)));

    public static final Block EVERNIGHT_SAND = registerBlock("evernight_sand",
            new FallingBlock(AbstractBlock.Settings.copy(Blocks.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
    });
    public static final Block EVERNIGHT_SANDSTONE = registerBlock("evernight_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block EVERNIGHT_SANDSTONE_STAIRS = registerBlock("evernight_sandstone_stairs",
            new StairsBlock(AncientRulesBlocks.EVERNIGHT_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS)));
    public static final Block EVERNIGHT_SANDSTONE_SLAB = registerBlock("evernight_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)));
    public static final Block EVERNIGHT_SANDSTONE_WALL = registerBlock("evernight_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL)));
    public static final Block EVERNIGHT_SMOOTH_SANDSTONE = registerBlock("evernight_smooth_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block EVERNIGHT_SMOOTH_SANDSTONE_STAIRS = registerBlock("evernight_smooth_sandstone_stairs",
            new StairsBlock(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_STAIRS)));
    public static final Block EVERNIGHT_SMOOTH_SANDSTONE_SLAB = registerBlock("evernight_smooth_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)));
    public static final Block EVERNIGHT_CUT_SANDSTONE = registerBlock("evernight_cut_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block EVERNIGHT_CUT_SANDSTONE_SLAB = registerBlock("evernight_cut_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB)));
    public static final Block EVERNIGHT_CHISELED_SANDSTONE = registerBlock("evernight_chiseled_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));

    public static final Block EVERNIGHT_CACTUS = registerBlock("evernight_cactus",
            new EvernightCactusBlock(AbstractBlock.Settings.copy(Blocks.CACTUS)));

    public static final Block MAGNETIZED_IRON_BLOCK = registerBlock("magnetized_iron_block",
            new MagnetizedIronBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AncientRules.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AncientRules.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerAncientRulesBlocks() {
        AncientRules.LOGGER.info("Registering Mod Blocks for " + AncientRules.MOD_ID);
    }
}
