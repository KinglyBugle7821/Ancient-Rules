package net.projectk.ancientrules;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.block.AncientRulesBlocks;

public class AncientRulesGroups {
    public static final ItemGroup ANCIENT_RULES_MOD_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientRules.MOD_ID, "ancient_rules_mod"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(AncientRulesBlocks.CHROME_SAPLING))
                    .displayName(Text.translatable("itemtab.ancient-rules.mod_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(AncientRulesBlocks.CHROME_LOG);
                        entries.add(AncientRulesBlocks.CHROME_WOOD);
                        entries.add(AncientRulesBlocks.STRIPPED_CHROME_LOG);
                        entries.add(AncientRulesBlocks.STRIPPED_CHROME_WOOD);

                        entries.add(AncientRulesBlocks.CHROME_PLANKS);
                        entries.add(AncientRulesBlocks.CHROME_LEAVES);

                        entries.add(AncientRulesBlocks.CHROME_SAPLING);
                    }).build());

    public static void registerItemGroup() {
        AncientRules.LOGGER.info("Registering Item Groups For " + AncientRules.MOD_ID);
    }
}
