package com.kekecreations.magnify.core.registry;

import com.chikoritalover.caffeinated.registry.CaffeinatedBlocks;
import com.chikoritalover.caffeinated.registry.CaffeinatedItems;
import com.kekecreations.magnify.common.util.CompatUtils;
import com.kekecreations.magnify.core.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class MagnifyFabricCreativeTabs {
    static {
        if (Services.PLATFORM.isModLoaded(CompatUtils.CAFFEINATED)) {
            final Supplier<CreativeModeTab> CAFFEINATED_TAB = registerCreativeModeTab("caffeinated_tab",
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(CaffeinatedItems.COFFEE_BEANS))
                            .title(Component.translatable("magnify.caffeinated_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(CaffeinatedItems.COFFEE_BERRIES);
                                pOutput.accept(CaffeinatedBlocks.COFFEE_BERRY_CRATE);
                                pOutput.accept(CaffeinatedItems.COFFEE_BEANS);
                                pOutput.accept(CaffeinatedBlocks.COFFEE_BEAN_BLOCK);
                                pOutput.accept(CaffeinatedItems.GROUND_COFFEE);
                                pOutput.accept(CaffeinatedBlocks.GROUND_COFFEE_BLOCK);
                                pOutput.accept(CaffeinatedItems.COFFEE_BOTTLE);
                                pOutput.accept(CaffeinatedItems.TIRAMISU);
                                pOutput.accept(CaffeinatedItems.JAVA_BANNER_PATTERN);
                            }).build());
        }
    }

    private static <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String name, Supplier<T> tabSupplier) {
        return Services.REGISTRY.registerCreativeModeTab(name, tabSupplier);
    }

    public static void register() {
    }
}