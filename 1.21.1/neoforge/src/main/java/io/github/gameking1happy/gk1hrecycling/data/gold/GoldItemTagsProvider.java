package io.github.gameking1happy.gk1hrecycling.data.gold;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.*;
import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * Gold Recycling item tags datagen.
 */
public class GoldItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public GoldItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Gold";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(itkc("gold_recycling","becomes_gold_nugget"))
                .add(Items.GOLDEN_CARROT)
                .remove(Items.CLOCK)
                .addOptional(fnap("illagerinvasion","horn_of_sight"))
                .addOptional(fnap("waystones","blank_scroll"))
                .addOptional(fnap("waystones","warp_scroll"))
                .addOptional(fnap("waystones","bound_scroll"))
                .addOptional(fnap("waystones","return_scroll"))
                .addOptional(fnap("moblassos","golden_lasso"))
                .addOptional(fnap("horseexpert","monocle"))
                .addOptional(fnap("arcanelanterns","feral_lantern"))
                .addOptional(fnap("barteringstation","bartering_station"))
                .addOptional(fnap("bagofholding","golden_bag_of_holding"))
                .addOptional(fnap("magnumtorch","emerald_magnum_torch"))
                .addOptional(fnap("magnumtorch","amethyst_magnum_torch"));
        tag(itkc("gold_recycling","becomes_gold_ingot"))
                .add(Items.CLOCK,Items.TOTEM_OF_UNDYING,Items.GOLDEN_APPLE,Items.ENCHANTED_GOLDEN_APPLE)
                .addOptional(fnap("spikyspikes","golden_spike"))
                .addOptional(fnap("travelersbackpack","gold"))
                .addOptional(fnap("travelersbackpack","gold_tier_upgrade"))
                .addOptional(fnap("metalbundles","golden_bundle"))
                .addOptional(fnap("reinfbarrel","gold_barrel"))
                .addOptional(fnap("reinfchest","gold_chest"))
                .addOptionalTag(itkc("reinfshulker","gold_shulker_boxes"));
    }
}