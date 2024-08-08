package com.kekecreations.magnify.core.registry;

import blueduck.dustrial.dustrialdecor.registry.DustrialBlocks;
import blueduck.jollyboxes.registry.JollyBoxesBlocks;
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
import net.minecraft.world.item.Items;

import java.util.function.Supplier;

public class MagnifyForgeCreativeTabs {

static {
    if (Services.PLATFORM.isModLoaded(CompatUtils.JOLLY_BOXES)) {
        final Supplier<CreativeModeTab> JOLLY_BOXES_TAB = registerCreativeModeTab("jolly_boxes_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(Items.CHEST))
                        .title(Component.translatable("magnify.jolly_boxes_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(JollyBoxesBlocks.SMALL_JOLLY_BOX.get());
                            pOutput.accept(JollyBoxesBlocks.MEDIUM_JOLLY_BOX.get());
                            pOutput.accept(JollyBoxesBlocks.LARGE_JOLLY_BOX.get());
                        }).build());
    }
    if (Services.PLATFORM.isModLoaded(CompatUtils.DUSTRIAL_DECOR)) {
        final Supplier<CreativeModeTab> DUSTRIAL_DECOR_TAB = registerCreativeModeTab("dustrial_decor_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(DustrialBlocks.CARDBOARD_BOX.get()))
                        .title(Component.translatable("magnify.dustrial_decor_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(DustrialBlocks.CARDBOARD.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_HELMET.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_CHESTPLATE.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_LEGGINGS.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_BOOTS.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_SCRAP.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_BOX.get());
                            pOutput.accept(DustrialBlocks.FOLDED_CARDBOARD.get());
                            pOutput.accept(DustrialBlocks.SMOOTH_CARDBOARD.get());
                            pOutput.accept(DustrialBlocks.SMOOTH_CARDBOARD_STAIRS.get());
                            pOutput.accept(DustrialBlocks.SMOOTH_CARDBOARD_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.SMOOTH_CARDBOARD_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.CARDBOARD_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.CARDBOARD_DOOR.get());
                            pOutput.accept(DustrialBlocks.PADDED_BLOCK.get());
                            pOutput.accept(DustrialBlocks.MINI_PADDED_BLOCK.get());
                            pOutput.accept(DustrialBlocks.MINI_PADDED_STAIRS.get());
                            pOutput.accept(DustrialBlocks.MINI_PADDED_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.MINI_PADDED_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.PADDED_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.PADDED_DOOR.get());

                            pOutput.accept(DustrialBlocks.CHAIN_LINK_FENCE.get());
                            pOutput.accept(DustrialBlocks.BARBED_CHAIN_LINK_FENCE.get());
                            pOutput.accept(DustrialBlocks.BARBED_IRON_BARS.get());
                            pOutput.accept(DustrialBlocks.GOLD_CHAIN.get());
                            pOutput.accept(DustrialBlocks.LARGE_CHAIN.get());
                            pOutput.accept(DustrialBlocks.LARGE_GOLD_CHAIN.get());
                            pOutput.accept(DustrialBlocks.ANCHOR.get());
                            pOutput.accept(DustrialBlocks.HOOK.get());
                            pOutput.accept(DustrialBlocks.CHAIN_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.CHAIN_DOOR.get());

                            pOutput.accept(DustrialBlocks.INDUSTRIAL_IRON_BILLET.get());
                            pOutput.accept(DustrialBlocks.INDUSTRIAL_IRON_BLOCK.get());
                            pOutput.accept(DustrialBlocks.INDUSTRIAL_IRON_PILLAR.get());
                            pOutput.accept(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK.get());
                            pOutput.accept(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_STAIRS.get());
                            pOutput.accept(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.INDUSTRIAL_IRON_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.INDUSTRIAL_IRON_DOOR.get());

                            pOutput.accept(DustrialBlocks.CAST_IRON_BILLET.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_BLOCK.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_PILLAR.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_BRICKS.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_BRICKS_STAIRS.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_BRICKS_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.CAST_IRON_BRICKS_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.ENGRAVED_CAST_IRON_BLOCK.get());
                            pOutput.accept(DustrialBlocks.CAST_IRON_BALUSTRADE.get());

                            pOutput.accept(DustrialBlocks.SHEET_METAL.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_PLATING.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_PLATING_STAIRS.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_PLATING_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.SHEET_METAL_PLATING_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.SHEET_METAL_PANELING.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_SIDING.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_WALLING.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_TREADING.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_TREADING_STAIRS.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_TREADING_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.SHEET_METAL_TREADING_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.SHEET_METAL_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.SHEET_METAL_DOOR.get());

                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_PLATING.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_STAIRS.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_PANELING.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_SIDING.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_WALLING.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_TREADING.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_STAIRS.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.RUSTY_SHEET_METAL_DOOR.get());

                            pOutput.accept(DustrialBlocks.CINDER_BLOCK.get());
                            pOutput.accept(DustrialBlocks.POLISHED_CINDER_BLOCK.get());
                            pOutput.accept(DustrialBlocks.CINDER_BRICKS.get());
                            pOutput.accept(DustrialBlocks.CINDER_BRICKS_STAIRS.get());
                            pOutput.accept(DustrialBlocks.CINDER_BRICKS_SLAB.get());
                            if (Services.PLATFORM.isModLoaded("quark")) {
                                pOutput.accept(DustrialBlocks.CINDER_BRICKS_VERTICAL_SLAB.get());
                            }
                            pOutput.accept(DustrialBlocks.RUSTY_IRON_INGOT.get());
                            pOutput.accept(DustrialBlocks.RUSTY_IRON_NUGGET.get());
                            pOutput.accept(DustrialBlocks.RUSTY_IRON_BLOCK.get());
                            pOutput.accept(DustrialBlocks.RUSTY_IRON_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.RUSTY_IRON_DOOR.get());
                            pOutput.accept(DustrialBlocks.WRAPPED_CHAINS.get());
                            pOutput.accept(DustrialBlocks.WRAPPED_GOLD_CHAINS.get());
                            pOutput.accept(DustrialBlocks.IRON_BAR_TRAPDOOR.get());
                            pOutput.accept(DustrialBlocks.IRON_BAR_DOOR.get());
                            pOutput.accept(DustrialBlocks.REDSTONE_LANTERN.get());
                            pOutput.accept(DustrialBlocks.LARGE_LANTERN.get());
                            pOutput.accept(DustrialBlocks.LARGE_SOUL_LANTERN.get());
                            pOutput.accept(DustrialBlocks.LARGE_REDSTONE_LANTERN.get());
                            pOutput.accept(DustrialBlocks.RED_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.ORANGE_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.YELLOW_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.GREEN_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.CYAN_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.BLUE_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.PINK_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.PURPLE_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.RAINBOW_NEON_LIGHT.get());
                            pOutput.accept(DustrialBlocks.BLACK_LIGHT.get());
                        }).build());
    }
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
