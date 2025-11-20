package io.github.gameking1happy.gk1hrecycling.data.netherite;

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
        tag(TagKey.create(Registries.ITEM, fNAP("netherite_recycling","recycles_to_netherite_scrap")))
                .addOptional(fNAP("spikyspikes","netherite_spike"))
                .addOptional(fNAP("travelersbackpack","netherite_tier_upgrade"))
                .addOptional(fNAP("travelersbackpack","netherite"))
                .addOptional(fNAP("metalbundles","netherite_bundle"))
                .addOptional(fNAP("enchantinginfuser","advanced_enchanting_infuser"))
                .addOptional(fNAP("netheriteextras","netherite_wolf_armor"))
                .addOptional(fNAP("netheriteextras","totem_of_neverdying"))
                .addOptional(fNAP("netheriteextras","enchanted_netherite_apple"))
                .addOptional(fNAP("netheriteextras","netherite_horse_armor"))
                .addOptional(fNAP("reinfbarrel","netherite_barrel"))
                .addOptional(fNAP("reinfchest","netherite_chest"))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("advancednetherite","tier/armor")))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("advancednetherite","tier/tools")))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("reinfshulker","netherite_shulker_boxes")));
    }
}