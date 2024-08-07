package com.kekecreations.magnify;

import net.fabricmc.api.ModInitializer;

public class FabricMagnify implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Magnify.init();
    }
}
