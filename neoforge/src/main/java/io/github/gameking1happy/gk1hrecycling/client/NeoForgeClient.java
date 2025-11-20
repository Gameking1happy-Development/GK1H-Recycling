package io.github.gameking1happy.gk1hrecycling.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hrecycling.Main.MOD_ID;

/**
 * The NeoForge client-side method for the mod.
 */
@SuppressWarnings("unused")
@Mod(value = MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClient {
    /**
     * Runs the NeoForge client-side mod initializer.
     */
    public NeoForgeClient() {
        Client.initclient();
    }
}
