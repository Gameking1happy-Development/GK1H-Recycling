package io.github.gameking1happy.gk1hrecycling.data;

import io.github.gameking1happy.gk1hrecycling.data.copper.CopperItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.diamond.DiamondItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.diamond.enchantinginfuser.EnchantingInfuserRecipeProvider;
import io.github.gameking1happy.gk1hrecycling.data.gold.GoldItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.iron.IronItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.leather.LeatherItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.leather.metalbundles.MetalBundlesRecipeProvider;
import io.github.gameking1happy.gk1hrecycling.data.netherite.NetheriteItemTagsProvider;
import io.github.gameking1happy.gk1hrecycling.data.netherite.gk1hrecipes.GK1HRecipesRecipeProvider;
import io.github.gameking1happy.gk1hrecycling.data.netherite.netheriteextras.NetheriteExtrasRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * GatherDataEventSubscribe class for datagen.
 */
@EventBusSubscriber(modid = MOD_ID)
public class GatherDataEventSubscribe {
    /**
     * @param event GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        PackOutput copperOutput = generator.getPackOutput("copper");
        PackOutput diamondOutput = generator.getPackOutput("diamond");
        PackOutput enchantingInfuserOutput = generator.getPackOutput("enchantinginfuser");
        PackOutput goldOutput = generator.getPackOutput("gold");
        PackOutput ironOutput = generator.getPackOutput("iron");
        PackOutput leatherOutput = generator.getPackOutput("leather");
        PackOutput metalBundlesOutput = generator.getPackOutput("metalbundles");
        PackOutput netheriteOutput = generator.getPackOutput("netherite");
        PackOutput gk1hRecipesOutput = generator.getPackOutput("gk1hrecipes");
        PackOutput netheriteExtrasOutput = generator.getPackOutput("netheriteextras");
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new MyBlockTagsProvider(output, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new CopperItemTagsProvider(copperOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new DiamondItemTagsProvider(diamondOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new EnchantingInfuserRecipeProvider(enchantingInfuserOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new GoldItemTagsProvider(goldOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new IronItemTagsProvider(ironOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new LeatherItemTagsProvider(leatherOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new MetalBundlesRecipeProvider(metalBundlesOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new NetheriteItemTagsProvider(netheriteOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new GK1HRecipesRecipeProvider(gk1hRecipesOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new NetheriteExtrasRecipeProvider(netheriteExtrasOutput, lookupProvider));
    }
}