package io.github.gameking1happy.gk1hrecycling.data.diamond;

import fuzs.enchantinginfuser.init.ModRegistry;
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

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

/**
 * Diamond Recycling Recipe datagen.
 */
public class DiamondRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public DiamondRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Diamond";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("t")
                .pattern("t")
                .group("recyclable_diamonds")
                .define('t', Ingredient.of(Items.ENCHANTING_TABLE, ModRegistry.INFUSER_ITEM.value()))
                .unlockedBy("has_enchanting_table", has(Items.ENCHANTING_TABLE))
                .unlockedBy("has_enchanting_infuser", has(ModRegistry.INFUSER_ITEM.value()))
                .save(output,fNAP("diamond_recycling","diamond_from_enchanting_tables"));
    }
}