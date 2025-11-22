package io.github.gameking1happy.gk1hrecycling.data.diamond;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
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
        tag(TagKey.create(Registries.ITEM, fNAP("diamond_recycling","recyclable_diamond_tools")))
                .addOptional(fNAP("illagerinvasion","hallowed_gem"))
                .addOptional(fNAP("moblassos","diamond_lasso"))
                .addOptional(fNAP("arcanelanterns","lantern_maker"))
                .addOptional(fNAP("arcanelanterns","love_lantern"))
                .addOptional(fNAP("miniumstone","minium_stone"))
                .addOptional(fNAP("portalgun","portal_gun_claw"))
                .addOptional(fNAP("portalgun","portal_gun"));
        tag(TagKey.create(Registries.ITEM, fNAP("diamond_recycling","recyclable_diamond_armor")))
                .addOptional(fNAP("spikyspikes","diamond_spike"))
                .addOptional(fNAP("travelersbackpack","diamond_tier_upgrade"))
                .addOptional(fNAP("travelersbackpack","diamond"))
                .addOptional(fNAP("magnumtorch","diamond_magnum_torch"))
                .addOptional(fNAP("metalbundles","diamond_bundle"))
                .addOptional(fNAP("reinfbarrel","diamond_barrel"))
                .addOptional(fNAP("reinfchest","diamond_chest"))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("reinfshulker","diamond_shulker_boxes")));
    }
}