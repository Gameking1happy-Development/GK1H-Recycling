package io.github.gameking1happy.gk1hrecycling.data.netherite.netheriteextras;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import org.jetbrains.annotations.NotNull;
import xyz.hafemann.netheriteextras.item.ModItems;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;
import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * Netherite Extras Recycling Recipe datagen.
 */
public class NetheriteExtrasRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public NetheriteExtrasRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-NetheriteExtras";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET)
                .pattern("aa")
                .pattern("aa")
                .group("netherite_nugget")
                .define('a', ModItems.NETHERITE_APPLE)
                .unlockedBy("has_netherite_apple", has(ModItems.NETHERITE_APPLE))
                .save(output,fnap(MOD_ID,"recycle_netherite_apple"));
    }
}