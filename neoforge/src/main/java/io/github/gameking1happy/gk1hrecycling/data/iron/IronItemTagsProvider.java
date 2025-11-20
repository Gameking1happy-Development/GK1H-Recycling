package io.github.gameking1happy.gk1hrecycling.data.iron;

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
        tag(TagKey.create(Registries.ITEM, fNAP("iron_recycling","becomes_iron_nugget")))
                .add(Items.SOUL_LANTERN, Items.IRON_DOOR, Items.SMITHING_TABLE, Items.SADDLE)
                .remove(Items.COMPASS)
                .addOptional(fNAP("moblassos","hostile_lasso"))
                .addOptional(fNAP("ytones","flat_lamp"))
                .addOptional(fNAP("hoppergadgetry","duct"))
                .addOptional(fNAP("bagofholding","iron_bag_of_holding"))
                .addOptional(fNAP("travelersbackpack","hose_nozzle"))
                .addOptional(fNAP("travelersbackpack","hose"))
                .addOptional(fNAP("travelersbackpack","magnet_upgrade"))
                .addOptional(fNAP("travelersbackpack","backpack_tank"));
        tag(TagKey.create(Registries.ITEM, fNAP("iron_recycling","becomes_iron_ingot")))
                .add(Items.COMPASS)
                .remove(Items.SMITHING_TABLE, Items.IRON_DOOR)
                .addOptional(fNAP("reinfchest","iron_chest"))
                .addOptional(fNAP("reinfbarrel","iron_barrel"))
                .addOptional(fNAP("metalbundles","iron_bundle"))
                .addOptional(fNAP("mutantmonsters","creeper_minion_tracker"))
                .addOptional(fNAP("travelersbackpack","iron_tier_upgrade"))
                .addOptional(fNAP("travelersbackpack","iron"))
                .addOptional(fNAP("hoppergadgetry","grated_hopper"))
                .addOptional(fNAP("hoppergadgetry","chute_minecart"))
                .addOptional(fNAP("hangglider","glider_framework"))
                .addOptional(fNAP("hangglider","hang_glider"))
                .addOptional(fNAP("hangglider","reinforced_hang_glider"))
                .addOptionalTag(TagKey.create(Registries.ITEM, fNAP("reinfshulker","iron_shulker_boxes")));
        tag(TagKey.create(Registries.ITEM, fNAP("iron_recycling","becomes_iron_block")))
                .addOptional(fNAP("spikyspikes","iron_spike"))
                .addOptional(fNAP("hoppergadgetry","grated_hopper_minecart"));
    }
}