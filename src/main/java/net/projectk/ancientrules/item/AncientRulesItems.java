package net.projectk.ancientrules.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.projectk.ancientrules.AncientRules;

public class AncientRulesItems {

    public static final Item MAGNETIZED_IRON_INGOT = registerItem("magnetized_iron_ingot", new Item(new Item.Settings()));
    public static final Item MAGNETIZED_IRON_NUGGET = registerItem("magnetized_iron_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(AncientRules.MOD_ID, name), item);
    }

    public static void registerAncientRulesItems(){
        AncientRules.LOGGER.info("Registering items for " + AncientRules.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MAGNETIZED_IRON_INGOT);
        });
    }
}
