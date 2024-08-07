package com.kekecreations.magnify.core.registry;

import com.illusivesoulworks.comforts.common.ComfortsRegistry;
import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import com.kekecreations.arts_and_crafts.core.registry.ACItems;
import com.kekecreations.magnify.common.util.CompatUtils;
import com.kekecreations.magnify.common.util.CreativeCategoryUtils;
import com.kekecreations.magnify.core.platform.Services;
import com.teamabnormals.clayworks.core.ClayworksConfig;
import com.teamabnormals.clayworks.core.registry.ClayworksBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class MagnifyForgeCreativeTabs {

static {
    if (Services.PLATFORM.isModLoaded(CompatUtils.CLAYWORKS)) {
        final Supplier<CreativeModeTab> CLAYWORKS_TAB = registerCreativeModeTab("clayworks_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(ClayworksBlocks.KILN.get()))
                        .title(Component.translatable("magnify.clayworks_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            if (ClayworksConfig.COMMON.kiln.get()) {
                                pOutput.accept(ClayworksBlocks.KILN.get());
                            }
                            if (ClayworksConfig.COMMON.decoratedPotColors.get()) {
                                for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                    pOutput.accept(ClayworksBlocks.getPotFromDyeColor(colour));
                                }
                            }
                            if (ClayworksConfig.COMMON.glazedTerracotta.get()) {
                                pOutput.accept(ClayworksBlocks.GLAZED_TERRACOTTA.get());
                            }
                            if (ClayworksConfig.COMMON.terracottaBricks.get()) {
                                pOutput.accept(ClayworksBlocks.TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.WHITE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.GRAY_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.BLACK_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.BROWN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.RED_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.ORANGE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.YELLOW_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.LIME_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.GREEN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CYAN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.BLUE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.PURPLE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.MAGENTA_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.PINK_TERRACOTTA_BRICKS.get());
                            }
                            if (ClayworksConfig.COMMON.terracottaVariants.get()) {
                                pOutput.accept(ClayworksBlocks.TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.RED_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get());
                                pOutput.accept(ClayworksBlocks.TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.RED_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.LIME_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get());
                                pOutput.accept(ClayworksBlocks.PINK_TERRACOTTA_BRICK_SLAB.get());
                            }
                            if (ClayworksConfig.COMMON.chiseledBricks.get()) {
                                pOutput.accept(ClayworksBlocks.CHISELED_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_WHITE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_LIGHT_GRAY_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_GRAY_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_BLACK_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_BROWN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_RED_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_ORANGE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_YELLOW_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_LIME_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_GREEN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_CYAN_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_LIGHT_BLUE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_BLUE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_PURPLE_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_MAGENTA_TERRACOTTA_BRICKS.get());
                                pOutput.accept(ClayworksBlocks.CHISELED_PINK_TERRACOTTA_BRICKS.get());
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
