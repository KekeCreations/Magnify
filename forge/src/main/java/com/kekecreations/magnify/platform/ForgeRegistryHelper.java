package com.kekecreations.magnify.platform;

import com.kekecreations.magnify.Magnify;
import com.kekecreations.magnify.platform.services.IRegistryHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ForgeRegistryHelper implements IRegistryHelper {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Magnify.MOD_ID);

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> tabSupplier) {
        return TABS.register(id, tabSupplier);
    }
}
