package io.github.gameking1happy.gk1hrecycling.data.gold;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
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
        tag(TagKey.create(Registries.ITEM, fNAP("gold_recycling","becomes_gold_nugget")))
                .add(Items.GOLDEN_CARROT)
                .remove(Items.CLOCK)
                .addOptional(fNAP("illagerinvasion","horn_of_sight"))
                .addOptional(fNAP("waystones","blank_scroll"))
                .addOptional(fNAP("waystones","warp_scroll"))
                .addOptional(fNAP("waystones","bound_scroll"))
                .addOptional(fNAP("waystones","return_scroll"))
                .addOptional(fNAP("moblassos","golden_lasso"))
                .addOptional(fNAP("horseexpert","monocle"))
                .addOptional(fNAP("arcanelanterns","feral_lantern"))
                .addOptional(fNAP("barteringstation","bartering_station"))
                .addOptional(fNAP("bagofholding","golden_bag_of_holding"))
                .addOptional(fNAP("magnumtorch","emerald_magnum_torch"))
                .addOptional(fNAP("magnumtorch","amethyst_magnum_torch"));
        tag(TagKey.create(Registries.ITEM, fNAP("gold_recycling","becomes_gold_ingot")))
                .add(Items.CLOCK,Items.TOTEM_OF_UNDYING,Items.GOLDEN_APPLE,Items.ENCHANTED_GOLDEN_APPLE)
                .addOptional(fNAP("spikyspikes","golden_spike"))
                .addOptional(fNAP("travelersbackpack","gold"))
                .addOptional(fNAP("travelersbackpack","gold_tier_upgrade"))
                .addOptional(fNAP("metalbundles","golden_bundle"))
                .addOptional(fNAP("reinfbarrel","gold_barrel"))
                .addOptional(fNAP("reinfchest","gold_chest"))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("reinfshulker","gold_shulker_boxes")));
    }
}