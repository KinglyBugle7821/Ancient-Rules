package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.projectk.ancientrules.block.AncientRulesBlocks;

import java.util.concurrent.CompletableFuture;

public class AncientRulesRecipeProvider extends FabricRecipeProvider {
    public AncientRulesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.CHROMEWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', AncientRulesBlocks.CHROMEWOOD_LOG)
                .criterion(hasItem(AncientRulesBlocks.CHROMEWOOD_LOG), conditionsFromItem(AncientRulesBlocks.CHROMEWOOD_LOG))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.STRIPPED_CHROMEWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG)
                .criterion(hasItem(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG), conditionsFromItem(AncientRulesBlocks.STRIPPED_CHROMEWOOD_LOG))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.CHROMEWOOD_PLANKS, 4)
                .input(AncientRulesBlocks.CHROMEWOOD_LOG)
                .criterion(hasItem(AncientRulesBlocks.CHROMEWOOD_LOG), conditionsFromItem(AncientRulesBlocks.CHROMEWOOD_LOG))
                .offerTo(recipeExporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.CHROMEWOOD_SLAB, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_PLANKS));
        createStairsRecipe(AncientRulesBlocks.CHROMEWOOD_STAIRS, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_PLANKS));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.CHROMEWOOD_BUTTON)
                .input(AncientRulesBlocks.CHROMEWOOD_PLANKS)
                .criterion(hasItem(AncientRulesBlocks.CHROMEWOOD_PLANKS), conditionsFromItem(AncientRulesBlocks.CHROMEWOOD_PLANKS))
                .offerTo(recipeExporter);
        createFenceRecipe(AncientRulesBlocks.CHROMEWOOD_FENCE, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_PLANKS));
        createFenceGateRecipe(AncientRulesBlocks.CHROMEWOOD_FENCE_GATE, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_PLANKS));
        createDoorRecipe(AncientRulesBlocks.CHROMEWOOD_DOOR, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_PLANKS));
        createTrapdoorRecipe(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR, Ingredient.ofItems(AncientRulesBlocks.CHROMEWOOD_TRAPDOOR));
    }
}
