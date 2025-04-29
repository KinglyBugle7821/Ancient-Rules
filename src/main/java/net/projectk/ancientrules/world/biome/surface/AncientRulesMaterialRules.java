package net.projectk.ancientrules.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.world.biome.AncientRulesBiomes;

public class AncientRulesMaterialRules {
    private static final MaterialRules.MaterialRule EVERNIGHT_SAND = makeStateRule(AncientRulesBlocks.EVERNIGHT_SAND);
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAboveWater = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule surface = MaterialRules.sequence(
                MaterialRules.condition(isAboveWater, GRASS_BLOCK), // Grass above water level
                DIRT // Otherwise dirt
        );

        return MaterialRules.sequence(
                MaterialRules.condition(
                        MaterialRules.biome(AncientRulesBiomes.EVERNIGHT_BIOME),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, EVERNIGHT_SAND)
                ),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, EVERNIGHT_SAND)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
