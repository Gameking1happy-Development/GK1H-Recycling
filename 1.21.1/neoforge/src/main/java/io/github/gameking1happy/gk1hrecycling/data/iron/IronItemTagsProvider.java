package io.github.gameking1happy.gk1hrecycling.data.iron;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.ITKC;
import static io.github.gameking1happy.gk1hcore.data.CoreData.fNaP;
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
        tag(ITKC("iron_recycling","becomes_iron_nugget"))
                .add(Items.SOUL_LANTERN, Items.IRON_DOOR, Items.SMITHING_TABLE, Items.SADDLE)
                .remove(Items.COMPASS)
                .addOptional(fNaP("moblassos","hostile_lasso"))
                .addOptional(fNaP("ytones","flat_lamp"))
                .addOptional(fNaP("hoppergadgetry","duct"))
                .addOptional(fNaP("bagofholding","iron_bag_of_holding"))
                .addOptional(fNaP("travelersbackpack","hose_nozzle"))
                .addOptional(fNaP("travelersbackpack","hose"))
                .addOptional(fNaP("travelersbackpack","magnet_upgrade"))
                .addOptional(fNaP("travelersbackpack","backpack_tank"));
        tag(ITKC("iron_recycling","becomes_iron_ingot"))
                .add(Items.COMPASS)
                .remove(Items.SMITHING_TABLE, Items.IRON_DOOR)
                .addOptional(fNaP("reinfchest","iron_chest"))
                .addOptional(fNaP("reinfbarrel","iron_barrel"))
                .addOptional(fNaP("metalbundles","iron_bundle"))
                .addOptional(fNaP("mutantmonsters","creeper_minion_tracker"))
                .addOptional(fNaP("travelersbackpack","iron_tier_upgrade"))
                .addOptional(fNaP("travelersbackpack","iron"))
                .addOptional(fNaP("hoppergadgetry","grated_hopper"))
                .addOptional(fNaP("hoppergadgetry","chute_minecart"))
                .addOptional(fNaP("hangglider","glider_framework"))
                .addOptional(fNaP("hangglider","hang_glider"))
                .addOptional(fNaP("hangglider","reinforced_hang_glider"))
                .addOptionalTag(ITKC("reinfshulker","iron_shulker_boxes"));
        tag(ITKC("iron_recycling","becomes_iron_block"))
                .addOptional(fNaP("spikyspikes","iron_spike"))
                .addOptional(fNaP("hoppergadgetry","grated_hopper_minecart"));
    }
}