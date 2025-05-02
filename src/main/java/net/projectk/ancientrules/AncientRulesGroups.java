package net.projectk.ancientrules;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.item.AncientRulesItems;

public class AncientRulesGroups {
    public static final ItemGroup ANCIENT_RULES_MOD_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientRules.MOD_ID, "ancient_rules_mod"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(AncientRulesBlocks.CHROMEWOOD_SAPLING))
                    .displayName(Text.translatable("itemtab.ancient-rules.mod_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(AncientRulesBlocks.CHROMEWOOD_LOG);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_WOOD);
                        entries.add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG);
                        entries.add(AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD);

                        entries.add(AncientRulesBlocks.CHROMEWOOD_PLANKS);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_LEAVES);

                        entries.add(AncientRulesBlocks.CHROMEWOOD_SAPLING);

                        entries.add(AncientRulesBlocks.CHROMEWOOD_SLAB);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_STAIRS);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_BUTTON);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_PRESSURE_PLATE);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_FENCE);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_DOOR);
                        entries.add(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR);

                        entries.add(AncientRulesBlocks.RED_LED_PANEL);
                        entries.add(AncientRulesBlocks.BLUE_LED_PANEL);
                        entries.add(AncientRulesBlocks.YELLOW_LED_PANEL);
                        entries.add(AncientRulesBlocks.GREEN_LED_PANEL);
                        entries.add(AncientRulesBlocks.BLACK_LED_PANEL);
                        entries.add(AncientRulesBlocks.WHITE_LED_PANEL);
                        entries.add(AncientRulesBlocks.ORANGE_LED_PANEL);
                        entries.add(AncientRulesBlocks.PURPLE_LED_PANEL);
                        entries.add(AncientRulesBlocks.LIGHT_BLUE_LED_PANEL);
                        entries.add(AncientRulesBlocks.LIME_LED_PANEL);
                        entries.add(AncientRulesBlocks.PINK_LED_PANEL);
                        entries.add(AncientRulesBlocks.GRAY_LED_PANEL);
                        entries.add(AncientRulesBlocks.LIGHT_GRAY_LED_PANEL);
                        entries.add(AncientRulesBlocks.CYAN_LED_PANEL);
                        entries.add(AncientRulesBlocks.MAGENTA_LED_PANEL);
                        entries.add(AncientRulesBlocks.BROWN_LED_PANEL);

                        entries.add(AncientRulesBlocks.EVERNIGHT_SAND);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SANDSTONE);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_STAIRS);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_STAIRS);
                        entries.add(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_SLAB);
                        entries.add(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE);
                        entries.add(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE_SLAB);
                        entries.add(AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE);

                        entries.add(AncientRulesBlocks.EVERNIGHT_CACTUS);

                        entries.add(AncientRulesItems.MAGNETIZED_IRON_INGOT);
                        entries.add(AncientRulesItems.MAGNETIZED_IRON_NUGGET);
                        entries.add(AncientRulesBlocks.MAGNETIZED_IRON_BLOCK);
                    }).build());

    public static void registerItemGroup() {
        AncientRules.LOGGER.info("Registering Item Groups For " + AncientRules.MOD_ID);
    }
}
