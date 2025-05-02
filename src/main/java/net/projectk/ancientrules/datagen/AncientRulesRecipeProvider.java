package net.projectk.ancientrules.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.projectk.ancientrules.block.AncientRulesBlocks;
import net.projectk.ancientrules.item.AncientRulesItems;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AncientRulesRecipeProvider extends FabricRecipeProvider {
    public AncientRulesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    private static final List<ItemConvertible> EVERNIGHT_SANDSTONE = List.of(AncientRulesBlocks.EVERNIGHT_SANDSTONE);

    private static final Map<Block, Block> LED_PANELS = Map.ofEntries(
            Map.entry(Blocks.RED_STAINED_GLASS_PANE, AncientRulesBlocks.RED_LED_PANEL),
            Map.entry(Blocks.BLUE_STAINED_GLASS_PANE, AncientRulesBlocks.BLUE_LED_PANEL),
            Map.entry(Blocks.YELLOW_STAINED_GLASS_PANE, AncientRulesBlocks.YELLOW_LED_PANEL),
            Map.entry(Blocks.GREEN_STAINED_GLASS_PANE, AncientRulesBlocks.GREEN_LED_PANEL),
            Map.entry(Blocks.BLACK_STAINED_GLASS_PANE, AncientRulesBlocks.BLACK_LED_PANEL),
            Map.entry(Blocks.WHITE_STAINED_GLASS_PANE, AncientRulesBlocks.WHITE_LED_PANEL),
            Map.entry(Blocks.ORANGE_STAINED_GLASS_PANE, AncientRulesBlocks.ORANGE_LED_PANEL),
            Map.entry(Blocks.PURPLE_STAINED_GLASS_PANE, AncientRulesBlocks.PURPLE_LED_PANEL),
            Map.entry(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, AncientRulesBlocks.LIGHT_BLUE_LED_PANEL),
            Map.entry(Blocks.LIME_STAINED_GLASS_PANE, AncientRulesBlocks.LIME_LED_PANEL),
            Map.entry(Blocks.PINK_STAINED_GLASS_PANE, AncientRulesBlocks.PINK_LED_PANEL),
            Map.entry(Blocks.GRAY_STAINED_GLASS_PANE, AncientRulesBlocks.GRAY_LED_PANEL),
            Map.entry(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, AncientRulesBlocks.LIGHT_GRAY_LED_PANEL),
            Map.entry(Blocks.CYAN_STAINED_GLASS_PANE, AncientRulesBlocks.CYAN_LED_PANEL),
            Map.entry(Blocks.MAGENTA_STAINED_GLASS_PANE, AncientRulesBlocks.MAGENTA_LED_PANEL),
            Map.entry(Blocks.BROWN_STAINED_GLASS_PANE, AncientRulesBlocks.BROWN_LED_PANEL)
    );
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

        LED_PANELS.forEach((paneBlock, ledPanelBlock) -> {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ledPanelBlock, 4)
                    .pattern("R#R")
                    .pattern("#T#")
                    .pattern("R#R")
                    .input('#', paneBlock)
                    .input('R', Items.REDSTONE)
                    .input('T', Items.REDSTONE_TORCH)
                    .criterion(hasItem(paneBlock), conditionsFromItem(paneBlock))
                    .offerTo(recipeExporter);
        });

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SANDSTONE)
                .pattern("##")
                .pattern("##")
                .input('#', AncientRulesBlocks.EVERNIGHT_SAND)
                .criterion(hasItem(AncientRulesBlocks.EVERNIGHT_SAND), conditionsFromItem(AncientRulesBlocks.EVERNIGHT_SAND))
                .offerTo(recipeExporter);
        createStairsRecipe(AncientRulesBlocks.EVERNIGHT_SANDSTONE_STAIRS, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_SANDSTONE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS ,AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_SANDSTONE));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL)
                .pattern("###")
                .pattern("###")
                .input('#', AncientRulesBlocks.EVERNIGHT_SANDSTONE)
                .criterion(hasItem(AncientRulesBlocks.EVERNIGHT_SANDSTONE), conditionsFromItem(AncientRulesBlocks.EVERNIGHT_SANDSTONE))
                .offerTo(recipeExporter);
        offerSmelting(recipeExporter, EVERNIGHT_SANDSTONE, RecipeCategory.MISC, AncientRulesBlocks.EVERNIGHT_SANDSTONE,
                0.7f, 200, "sandstone");
        offerBlasting(recipeExporter, EVERNIGHT_SANDSTONE, RecipeCategory.MISC, AncientRulesBlocks.EVERNIGHT_SANDSTONE,
                0.7f, 100, "sandstone");
        createStairsRecipe(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_STAIRS, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_SLAB, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE, 4)
                .pattern("##")
                .pattern("##")
                .input('#', AncientRulesBlocks.EVERNIGHT_SANDSTONE)
                .criterion(hasItem(AncientRulesBlocks.EVERNIGHT_SANDSTONE), conditionsFromItem(AncientRulesBlocks.EVERNIGHT_SAND))
                .offerTo(recipeExporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE_SLAB, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE));
        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE, Ingredient.ofItems(AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.MAGNETIZED_IRON_BLOCK)
                .input(AncientRulesItems.MAGNETIZED_IRON_INGOT, 9)
                .criterion(hasItem(AncientRulesItems.MAGNETIZED_IRON_INGOT), conditionsFromItem(AncientRulesItems.MAGNETIZED_IRON_INGOT))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesItems.MAGNETIZED_IRON_INGOT, 9)
                .input(AncientRulesBlocks.MAGNETIZED_IRON_BLOCK)
                .criterion(hasItem(AncientRulesBlocks.MAGNETIZED_IRON_BLOCK), conditionsFromItem(AncientRulesBlocks.MAGNETIZED_IRON_BLOCK))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, AncientRulesItems.MAGNETIZED_IRON_NUGGET, 9)
                .input(AncientRulesItems.MAGNETIZED_IRON_INGOT)
                .criterion(hasItem(AncientRulesItems.MAGNETIZED_IRON_INGOT), conditionsFromItem(AncientRulesItems.MAGNETIZED_IRON_INGOT))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SANDSTONE_STAIRS, AncientRulesBlocks.EVERNIGHT_SANDSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SANDSTONE_SLAB, AncientRulesBlocks.EVERNIGHT_SANDSTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SANDSTONE_WALL, AncientRulesBlocks.EVERNIGHT_SANDSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_STAIRS, AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE_SLAB, AncientRulesBlocks.EVERNIGHT_SMOOTH_SANDSTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE, AncientRulesBlocks.EVERNIGHT_SANDSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE_SLAB, AncientRulesBlocks.EVERNIGHT_CUT_SANDSTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, AncientRulesBlocks.EVERNIGHT_CHISELED_SANDSTONE, AncientRulesBlocks.EVERNIGHT_SANDSTONE);
    }
}
