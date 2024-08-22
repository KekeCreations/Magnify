package com.kekecreations.magnify.core.registry;

import com.chikoritalover.caffeinated.registry.CaffeinatedBlocks;
import com.chikoritalover.caffeinated.registry.CaffeinatedItems;
import com.kekecreations.magnify.common.util.CompatUtils;
import com.kekecreations.magnify.core.platform.Services;
import net.digitalpear.pigsteel.init.PigsteelBlocks;
import net.digitalpear.pigsteel.init.PigsteelItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.uraneptus.snowpig.core.registry.SnowPigItems;

import java.util.List;
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
        if (Services.PLATFORM.isModLoaded(CompatUtils.SNOW_PIG)) {
            final Supplier<CreativeModeTab> SNOW_PIG_TAB = registerCreativeModeTab("snow_pig_tab",
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(SnowPigItems.FROZEN_HAM))
                            .title(Component.translatable("magnify.snow_pig_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(SnowPigItems.MUSIC_DISC_FROSTY_SNIG);
                                pOutput.accept(SnowPigItems.FROZEN_PORKCHOP);
                                pOutput.accept(SnowPigItems.FROZEN_HAM);
                                pOutput.accept(SnowPigItems.SNOW_PIG_EGG);
                            }).build());
        }
        if (Services.PLATFORM.isModLoaded(CompatUtils.PIGSTEEL)) {
            final Supplier<CreativeModeTab> PIGSTEEL_TAB = registerCreativeModeTab("pigsteel_tab",
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(PigsteelBlocks.PORKSLAG))
                            .title(Component.translatable("magnify.pigsteel_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(PigsteelBlocks.PORKSLAG);
                                pOutput.accept(PigsteelItems.PIGSTEEL_CHUNK);
                                pOutput.accept(PigsteelBlocks.PIGSTEEL_CHUNK_BLOCK);
                                for (Block block : PigsteelBlocks.refinedPigsteel.getAllBlocks()) {
                                    pOutput.accept(block);
                                }
                                for (Block block : PigsteelBlocks.cutPigsteel.getAllBlocks()) {
                                    pOutput.accept(block);
                                }
                                pOutput.accept(PigsteelBlocks.CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.INFECTED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.CORRUPTED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.WAXED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.WAXED_INFECTED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.WAXED_CORRUPTED_CUT_PIGSTEEL_STAIRS);
                                pOutput.accept(PigsteelBlocks.WAXED_ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
                                for (Block block : PigsteelBlocks.cutPigsteelSlabs.getAllBlocks()) {
                                    pOutput.accept(block);
                                }
                                for (Block block : PigsteelBlocks.pigsteelLanterns.getAllBlocks()) {
                                    pOutput.accept(block);
                                }
                                for (Block block : PigsteelBlocks.pigsteelSoulLanterns.getAllBlocks()) {
                                    pOutput.accept(block);
                                }
                            }).build());
        }
    }

    private static <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String name, Supplier<T> tabSupplier) {
        return Services.REGISTRY.registerCreativeModeTab(name, tabSupplier);
    }

    public static void register() {
    }
}
