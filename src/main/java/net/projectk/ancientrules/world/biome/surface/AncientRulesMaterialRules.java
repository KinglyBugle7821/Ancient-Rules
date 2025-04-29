package net.projectk.ancientrules.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.world.biome.AncientRulesBiomes;

public class AncientRulesMaterialRules {
    private static final MaterialRules.MaterialRule EVERNIGHT_SAND = makeStateRule(AncientRulesBlocks.EVERNIGHT_SAND);
    private static final MaterialRules.MaterialRule EVERNIGHT_SANDSTONE = makeStateRule(AncientRulesBlocks.EVERNIGHT_SANDSTONE);
    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isInEvernighBiome = MaterialRules.biome(AncientRulesBiomes.EVERNIGHT_BIOME);

        // Layer rules
        MaterialRules.MaterialRule topLayer = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR,
                EVERNIGHT_SAND
        );

        MaterialRules.MaterialRule fillerLayer = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH,
                EVERNIGHT_SANDSTONE
        );

        MaterialRules.MaterialRule deeperFillerLayer = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6,
                EVERNIGHT_SANDSTONE
        );

        return MaterialRules.sequence(
                MaterialRules.condition(
                        isInEvernighBiome,
                        MaterialRules.sequence(
                                topLayer,
                                fillerLayer,
                                deeperFillerLayer
                        )
                )
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
