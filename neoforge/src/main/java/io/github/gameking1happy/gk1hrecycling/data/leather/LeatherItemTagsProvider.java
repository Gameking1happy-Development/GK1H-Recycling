package io.github.gameking1happy.gk1hrecycling.data.leather;

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
 * Leather Recycling item tags datagen.
 */
public class LeatherItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public LeatherItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Leather";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(TagKey.create(Registries.ITEM, fNAP("leather_recycling","recycles_to_leather")))
                .remove(Items.SADDLE)
                .addOptional(fNAP("bagofholding","leather_bag_of_holding"));
        tag(TagKey.create(Registries.ITEM, fNAP("leather_recycling","recycles_to_rabbit_hide")))
                .addOptional(fNAP("hangglider","glider_wing"))
                .addOptional(fNAP("travelersbackpack","blank_upgrade"));
    }
}