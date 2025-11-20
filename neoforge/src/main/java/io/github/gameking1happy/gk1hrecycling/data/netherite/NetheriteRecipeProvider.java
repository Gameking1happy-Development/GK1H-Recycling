package io.github.gameking1happy.gk1hrecycling.data.netherite;

import xyz.hafemann.netheriteextras.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * Netherite Recycling Recipe datagen.
 */
public class NetheriteRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public NetheriteRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Netherite";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET)
                .pattern("aa")
                .pattern("aa")
                .group("netherite_nugget")
                .define('a', ModItems.NETHERITE_APPLE)
                .unlockedBy("has_netherite_apple", has(ModItems.NETHERITE_APPLE))
                .save(output,fNAP(MOD_ID,"recycle_netherite_apple"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.LODESTONE),RecipeCategory.MISC,Items.IRON_NUGGET,5).save(output,fNAP("netherite_recycling","recycle_lodestone_with_stonecutter"));
    }
}