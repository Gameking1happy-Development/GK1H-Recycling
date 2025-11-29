package io.github.gameking1happy.gk1hrecycling.data.netherite;

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
 * Netherite Recycling item tags datagen.
 */
public class NetheriteItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public NetheriteItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Netherite";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(ITKC("netherite_recycling","recycles_to_netherite_scrap"))
                .addOptional(fNaP("spikyspikes","netherite_spike"))
                .addOptional(fNaP("travelersbackpack","netherite_tier_upgrade"))
                .addOptional(fNaP("travelersbackpack","netherite"))
                .addOptional(fNaP("metalbundles","netherite_bundle"))
                .addOptional(fNaP("enchantinginfuser","advanced_enchanting_infuser"))
                .addOptional(fNaP("netheriteextras","netherite_wolf_armor"))
                .addOptional(fNaP("netheriteextras","totem_of_neverdying"))
                .addOptional(fNaP("netheriteextras","enchanted_netherite_apple"))
                .addOptional(fNaP("netheriteextras","netherite_horse_armor"))
                .addOptional(fNaP("reinfbarrel","netherite_barrel"))
                .addOptional(fNaP("reinfchest","netherite_chest"))
                .addOptionalTags(ITKC("advancednetherite","tier/armor"), ITKC("advancednetherite","tier/tools"),ITKC("reinfshulker","netherite_shulker_boxes"));
    }
}