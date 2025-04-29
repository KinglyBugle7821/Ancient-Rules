package net.projectk.ancientrules.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.projectk.ancientrules.AncientRules;
import net.projectk.ancientrules.world.AncientRulesConfiguredFeatures;

import java.util.Optional;

public class AncientRulesSaplingGenerators {
    public static final SaplingGenerator CHROMEWOOD = new SaplingGenerator(AncientRules.MOD_ID + ":chromewood",
            Optional.empty(), Optional.of(AncientRulesConfiguredFeatures.CHROMEWOOD_KEY), Optional.empty());
}
