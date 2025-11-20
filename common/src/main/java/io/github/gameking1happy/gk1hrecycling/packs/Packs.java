package io.github.gameking1happy.gk1hrecycling.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCDP;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
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
            addCDP(modContainerOrEvent, getModID(), "copper");
        }
        if (PLATFORM.isModLoaded("mr_diamond_recycling")) {
            addCDP(modContainerOrEvent, getModID(), "diamond");
        }
        if (PLATFORM.isModLoaded("mr_better_goldrecycling")) {
            addCDP(modContainerOrEvent, getModID(), "gold");
        }
        if (PLATFORM.isModLoaded("mr_better_ironrecycling")) {
            addCDP(modContainerOrEvent, getModID(), "iron");
        }
        if (PLATFORM.isModLoaded("mr_leather_recycling")) {
            addCDP(modContainerOrEvent, getModID(), "leather");
        }
        if (PLATFORM.isModLoaded("mr_netherite_recycling")) {
            addCDP(modContainerOrEvent, getModID(), "netherite");
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
