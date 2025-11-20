package io.github.gameking1happy.gk1hrecycling.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * Fabric server-side code.
 */
@SuppressWarnings("unused")
public class FabricClient implements ClientModInitializer {
    /**
     * Runs the Fabric mod initializer on the server environment.
     */
    @Override
    public void onInitializeClient() {
        Client.initclient();
    }
}
