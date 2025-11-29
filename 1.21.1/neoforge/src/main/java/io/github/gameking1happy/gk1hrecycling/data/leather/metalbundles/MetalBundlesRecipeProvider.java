package io.github.gameking1happy.gk1hrecycling.data.leather.metalbundles;

import fuzs.metalbundles.init.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.*;

/**
 * Metal Bundles Recycling Recipe datagen.
 */
public class MetalBundlesRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public MetalBundlesRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-MetalBundles";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LEATHER, 3)
                .pattern("bb")
                .pattern("bb")
                .group("leather")
                .define('b', Ingredient.of(Items.BUNDLE, ModRegistry.LEATHER_BUNDLE_ITEM.value()))
                .unlockedBy("has_bundle", has(Items.BUNDLE))
                .unlockedBy("has_leather_bundle", has(ModRegistry.LEATHER_BUNDLE_ITEM.value()))
                .save(output,fNaP("leather_recycling","leather_from_bundles"));
    }
}