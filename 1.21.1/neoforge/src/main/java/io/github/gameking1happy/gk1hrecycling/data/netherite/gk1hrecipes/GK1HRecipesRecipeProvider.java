package io.github.gameking1happy.gk1hrecycling.data.netherite.gk1hrecipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.*;

/**
 * GK1H Recipes Recycling Recipe datagen.
 */
public class GK1HRecipesRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public GK1HRecipesRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-GK1HRecipes";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.LODESTONE),RecipeCategory.MISC,Items.IRON_NUGGET,5).unlockedBy("has_lodestone", has(Items.LODESTONE)).save(output,fnap("netherite_recycling","recycle_lodestone_with_stonecutter"));
    }
}