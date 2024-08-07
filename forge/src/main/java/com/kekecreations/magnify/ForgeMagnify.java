package com.kekecreations.magnify;

import com.kekecreations.magnify.core.platform.ForgeRegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Magnify.MOD_ID)
public class ForgeMagnify {
    
    public ForgeMagnify() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ForgeRegistryHelper.TABS.register(eventBus);
        Magnify.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}