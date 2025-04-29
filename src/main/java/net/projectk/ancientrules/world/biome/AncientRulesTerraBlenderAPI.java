package net.projectk.ancientrules.world.biome;

import net.minecraft.util.Identifier;
import net.projectk.ancientrules.AncientRules;
import net.projectk.ancientrules.world.biome.surface.AncientRulesMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class AncientRulesTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new AncientRulesOverworldRegion(Identifier.of(AncientRules.MOD_ID, "overworld"), 10));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, AncientRules.MOD_ID, AncientRulesMaterialRules.makeRules());
    }
}
