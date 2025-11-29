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
        PackOutput CopperOutput = generator.getPackOutput("copper");
        PackOutput DiamondOutput = generator.getPackOutput("diamond");
        PackOutput EnchantingInfuserOutput = generator.getPackOutput("enchantinginfuser");
        PackOutput GoldOutput = generator.getPackOutput("gold");
        PackOutput IronOutput = generator.getPackOutput("iron");
        PackOutput LeatherOutput = generator.getPackOutput("leather");
        PackOutput MetalBundlesOutput = generator.getPackOutput("metalbundles");
        PackOutput NetheriteOutput = generator.getPackOutput("netherite");
        PackOutput GK1HRecipesOutput = generator.getPackOutput("gk1hrecipes");
        PackOutput NetheriteExtrasOutput = generator.getPackOutput("netheriteextras");
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new MyBlockTagsProvider(output, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new CopperItemTagsProvider(CopperOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new DiamondItemTagsProvider(DiamondOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new EnchantingInfuserRecipeProvider(EnchantingInfuserOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new GoldItemTagsProvider(GoldOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new IronItemTagsProvider(IronOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new LeatherItemTagsProvider(LeatherOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new MetalBundlesRecipeProvider(MetalBundlesOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new NetheriteItemTagsProvider(NetheriteOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new GK1HRecipesRecipeProvider(GK1HRecipesOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new NetheriteExtrasRecipeProvider(NetheriteExtrasOutput, lookupProvider));
    }
}