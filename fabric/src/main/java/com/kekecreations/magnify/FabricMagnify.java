package com.kekecreations.magnify;

import com.kekecreations.magnify.core.registry.MagnifyFabricCreativeTabs;
import net.fabricmc.api.ModInitializer;

public class FabricMagnify implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Magnify.init();
        MagnifyFabricCreativeTabs.register();
    }
}
