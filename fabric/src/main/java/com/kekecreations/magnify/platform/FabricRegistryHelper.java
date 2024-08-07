package com.kekecreations.magnify.platform;

import com.kekecreations.magnify.platform.services.IRegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

public class FabricRegistryHelper implements IRegistryHelper {


    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> tabSupplier) {
        var creativeModeTab = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, id, tabSupplier.get());
        return () -> creativeModeTab;
    }
}
