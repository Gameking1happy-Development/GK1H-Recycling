package io.github.gameking1happy.gk1hrecycling.data.copper;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;
import static io.github.gameking1happy.gk1hcore.data.CoreData.*;

/**
 * Copper Recycling item tags datagen.
 */
public class CopperItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public CopperItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagsProvider.TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Copper";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(itkc("copper_recycling","recyclable_copper"))
                .add(Items.BRUSH, Items.COPPER_BULB, Items.WAXED_COPPER_BULB)
                .addOptional(fnap("metalbundles","copper_bundle"))
                .addOptional(fnap("illagerinvasion","imbuing_table"))
                .addOptional(fnap("reinfchest","copper_chest"))
                .addOptional(fnap("reinfbarrel","copper_barrel"))
                .addOptionalTag(itkc("reinfshulker","copper_shulker_boxes"));
    }
}