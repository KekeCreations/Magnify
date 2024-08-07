package com.kekecreations.magnify.platform.services;

import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

public interface IRegistryHelper {

    <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> tabSupplier);
}
