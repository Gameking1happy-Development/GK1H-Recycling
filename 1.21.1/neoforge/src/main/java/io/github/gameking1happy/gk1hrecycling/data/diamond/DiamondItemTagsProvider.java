package io.github.gameking1happy.gk1hrecycling.data.diamond;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.*;
import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * Diamond Recycling item tags datagen.
 */
public class DiamondItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public DiamondItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Diamond";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(ITKC("diamond_recycling","recyclable_diamond_tools"))
                .addOptional(fNaP("illagerinvasion","hallowed_gem"))
                .addOptional(fNaP("moblassos","diamond_lasso"))
                .addOptional(fNaP("arcanelanterns","lantern_maker"))
                .addOptional(fNaP("arcanelanterns","love_lantern"))
                .addOptional(fNaP("miniumstone","minium_stone"))
                .addOptional(fNaP("portalgun","portal_gun_claw"))
                .addOptional(fNaP("portalgun","portal_gun"));
        tag(ITKC("diamond_recycling","recyclable_diamond_armor"))
                .addOptional(fNaP("spikyspikes","diamond_spike"))
                .addOptional(fNaP("travelersbackpack","diamond_tier_upgrade"))
                .addOptional(fNaP("travelersbackpack","diamond"))
                .addOptional(fNaP("magnumtorch","diamond_magnum_torch"))
                .addOptional(fNaP("metalbundles","diamond_bundle"))
                .addOptional(fNaP("reinfbarrel","diamond_barrel"))
                .addOptional(fNaP("reinfchest","diamond_chest"))
                .addOptionalTag(ITKC("reinfshulker","diamond_shulker_boxes"));
    }
}