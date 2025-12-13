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
        tag(itkc("netherite_recycling","recycles_to_netherite_scrap"))
                .addOptional(fnap("spikyspikes","netherite_spike"))
                .addOptional(fnap("travelersbackpack","netherite_tier_upgrade"))
                .addOptional(fnap("travelersbackpack","netherite"))
                .addOptional(fnap("metalbundles","netherite_bundle"))
                .addOptional(fnap("enchantinginfuser","advanced_enchanting_infuser"))
                .addOptional(fnap("netheriteextras","netherite_wolf_armor"))
                .addOptional(fnap("netheriteextras","totem_of_neverdying"))
                .addOptional(fnap("netheriteextras","enchanted_netherite_apple"))
                .addOptional(fnap("netheriteextras","netherite_horse_armor"))
                .addOptional(fnap("reinfbarrel","netherite_barrel"))
                .addOptional(fnap("reinfchest","netherite_chest"))
                .addOptionalTags(itkc("advancednetherite","tier/armor"), itkc("advancednetherite","tier/tools"),itkc("reinfshulker","netherite_shulker_boxes"));
    }
}