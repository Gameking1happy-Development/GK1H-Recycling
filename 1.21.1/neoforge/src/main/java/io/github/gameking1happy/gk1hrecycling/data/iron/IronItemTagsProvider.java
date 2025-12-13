package io.github.gameking1happy.gk1hrecycling.data.iron;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.itkc;
import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;
import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * Iron Recycling item tags datagen.
 */
public class IronItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public IronItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Iron";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(itkc("iron_recycling","becomes_iron_nugget"))
                .add(Items.SOUL_LANTERN, Items.IRON_DOOR, Items.SMITHING_TABLE, Items.SADDLE)
                .remove(Items.COMPASS)
                .addOptional(fnap("moblassos","hostile_lasso"))
                .addOptional(fnap("ytones","flat_lamp"))
                .addOptional(fnap("hoppergadgetry","duct"))
                .addOptional(fnap("bagofholding","iron_bag_of_holding"))
                .addOptional(fnap("travelersbackpack","hose_nozzle"))
                .addOptional(fnap("travelersbackpack","hose"))
                .addOptional(fnap("travelersbackpack","magnet_upgrade"))
                .addOptional(fnap("travelersbackpack","backpack_tank"));
        tag(itkc("iron_recycling","becomes_iron_ingot"))
                .add(Items.COMPASS)
                .remove(Items.SMITHING_TABLE, Items.IRON_DOOR)
                .addOptional(fnap("reinfchest","iron_chest"))
                .addOptional(fnap("reinfbarrel","iron_barrel"))
                .addOptional(fnap("metalbundles","iron_bundle"))
                .addOptional(fnap("mutantmonsters","creeper_minion_tracker"))
                .addOptional(fnap("travelersbackpack","iron_tier_upgrade"))
                .addOptional(fnap("travelersbackpack","iron"))
                .addOptional(fnap("hoppergadgetry","grated_hopper"))
                .addOptional(fnap("hoppergadgetry","chute_minecart"))
                .addOptional(fnap("hangglider","glider_framework"))
                .addOptional(fnap("hangglider","hang_glider"))
                .addOptional(fnap("hangglider","reinforced_hang_glider"))
                .addOptionalTag(itkc("reinfshulker","iron_shulker_boxes"));
        tag(itkc("iron_recycling","becomes_iron_block"))
                .addOptional(fnap("spikyspikes","iron_spike"))
                .addOptional(fnap("hoppergadgetry","grated_hopper_minecart"));
    }
}