package com.kekecreations.magnify.core.registry;

import com.illusivesoulworks.comforts.common.ComfortsRegistry;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import com.kekecreations.magnify.Magnify;
import com.kekecreations.magnify.common.util.SupportedModList;
import com.kekecreations.magnify.core.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class MagnifyCreativeTabs {

static {
    if (Services.PLATFORM.isModLoaded(SupportedModList.COMFORTS)) {
        final Supplier<CreativeModeTab> COMFORTS_TAB = registerCreativeModeTab("comforts_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(ComfortsRegistry.ROPE_AND_NAIL_ITEM.get()))
                        .title(Component.translatable("magnify.comforts_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ComfortsRegistry.ROPE_AND_NAIL_ITEM.get());
                            ComfortsRegistry.HAMMOCKS.forEach((dyeColor, blockRegistryObject) -> {
                                pOutput.accept(blockRegistryObject.get());
                            });
                            ComfortsRegistry.SLEEPING_BAGS.forEach((dyeColor, blockRegistryObject) -> {
                                pOutput.accept(blockRegistryObject.get());
                            });
                        }).build());
    }
}





    private static <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String name, Supplier<T> tabSupplier) {
        return JinxedRegistryHelper.registerCreativeModeTab(Magnify.MOD_ID, name, tabSupplier);
    }

    public static void register() {
    }
}
