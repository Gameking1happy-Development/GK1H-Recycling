package io.github.gameking1happy.gk1hrecycling.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCdp;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
import static io.github.gameking1happy.gk1hcore.compat.CompatFlags.*;
import static io.github.gameking1happy.gk1hrecipes.Main.lodestone;
import static io.github.gameking1happy.gk1hrecycling.Main.*;

/**
 * Class to add packs.
 */
@SuppressWarnings("unused")
public class Packs implements AddPacks {
    /**
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     */
    public void addPacks(@NotNull Object modContainerOrEvent) {
        if (PLATFORM.isModLoaded("mr_copper_recycling")) {
            addCdp(modContainerOrEvent, getModID(), "copper");
        }
        if (PLATFORM.isModLoaded("mr_diamond_recycling")) {
            addCdp(modContainerOrEvent, getModID(), "diamond");
            if(ENC_INF) {
                addCdp(modContainerOrEvent, getModID(), "enchantinginfuser");
            }
        }
        if (PLATFORM.isModLoaded("mr_better_goldrecycling")) {
            addCdp(modContainerOrEvent, getModID(), "gold");
        }
        if (PLATFORM.isModLoaded("mr_better_ironrecycling")) {
            addCdp(modContainerOrEvent, getModID(), "iron");
        }
        if (PLATFORM.isModLoaded("mr_leather_recycling")) {
            addCdp(modContainerOrEvent, getModID(), "leather");
            if(MET_BUN) {
                addCdp(modContainerOrEvent, getModID(), "metalbundles");
            }
        }
        if (PLATFORM.isModLoaded("mr_netherite_recycling")) {
            addCdp(modContainerOrEvent, getModID(), "netherite");
            if(NET_EXT) {
                addCdp(modContainerOrEvent, getModID(), "netheriteextras");
            }
            if(GK1H_RECIPES && lodestone) {
                addCdp(modContainerOrEvent, getModID(), "gk1hrecipes");
            }
        }
    }
    /**
     * @return Returns the mod ID.
     */
    @Override
    public @NotNull String getModID() {
        return MOD_ID;
    }
}
