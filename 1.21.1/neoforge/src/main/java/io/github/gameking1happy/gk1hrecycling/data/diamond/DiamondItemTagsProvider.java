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
        tag(itkc("diamond_recycling","recyclable_diamond_tools"))
                .addOptional(fnap("illagerinvasion","hallowed_gem"))
                .addOptional(fnap("moblassos","diamond_lasso"))
                .addOptional(fnap("arcanelanterns","lantern_maker"))
                .addOptional(fnap("arcanelanterns","love_lantern"))
                .addOptional(fnap("miniumstone","minium_stone"))
                .addOptional(fnap("portalgun","portal_gun_claw"))
                .addOptional(fnap("portalgun","portal_gun"));
        tag(itkc("diamond_recycling","recyclable_diamond_armor"))
                .addOptional(fnap("spikyspikes","diamond_spike"))
                .addOptional(fnap("travelersbackpack","diamond_tier_upgrade"))
                .addOptional(fnap("travelersbackpack","diamond"))
                .addOptional(fnap("magnumtorch","diamond_magnum_torch"))
                .addOptional(fnap("metalbundles","diamond_bundle"))
                .addOptional(fnap("reinfbarrel","diamond_barrel"))
                .addOptional(fnap("reinfchest","diamond_chest"))
                .addOptionalTag(itkc("reinfshulker","diamond_shulker_boxes"));
    }
}