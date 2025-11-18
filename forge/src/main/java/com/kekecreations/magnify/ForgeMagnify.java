package com.kekecreations.magnify;

import com.kekecreations.magnify.core.registry.MagnifyForgeCreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Magnify.MOD_ID)
public class ForgeMagnify {
    
    public ForgeMagnify() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MagnifyForgeCreativeTabs.register();
        Magnify.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}