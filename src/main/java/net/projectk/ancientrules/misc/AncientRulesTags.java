package net.projectk.ancientrules.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.AncientRules;

public class AncientRulesTags {
    public static class Blocks {

        public static final TagKey<Block> LED_PANELS = createTag("led_panels");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AncientRules.MOD_ID, name));
        }
    }
    public static class Items {

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(AncientRules.MOD_ID, name));
        }
    }
}
