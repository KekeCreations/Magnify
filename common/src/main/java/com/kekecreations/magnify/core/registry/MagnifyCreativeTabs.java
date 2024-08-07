package com.kekecreations.magnify.core.registry;

import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import com.kekecreations.arts_and_crafts.core.registry.ACItems;
import com.kekecreations.magnify.common.util.CompatUtils;
import com.kekecreations.magnify.common.util.CreativeCategoryUtils;
import com.kekecreations.magnify.core.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class MagnifyCreativeTabs {

static {
    if (Services.PLATFORM.isModLoaded(CompatUtils.ARTS_AND_CRAFTS)) {
        final Supplier<CreativeModeTab> ARTS_AND_CRAFTS_TAB = registerCreativeModeTab("arts_and_crafts_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(ACItems.getPaintBrush(DyeColor.RED.getId())))
                        .title(Component.translatable("magnify.arts_and_crafts_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ACBlocks.CORK_SAPLING.get());
                            pOutput.accept(ACBlocks.CORK_LEAVES.get());
                            pOutput.accept(ACBlocks.CORK_LOG.get());
                            pOutput.accept(ACBlocks.CORK_WOOD.get());
                            pOutput.accept(ACBlocks.STRIPPED_CORK_LOG.get());
                            pOutput.accept(ACBlocks.STRIPPED_CORK_WOOD.get());
                            pOutput.accept(ACBlocks.CORK.get());
                            pOutput.accept(ACBlocks.SMOOTH_CORK.get());
                            pOutput.accept(ACBlocks.CORK_PLANKS.get());
                            pOutput.accept(ACBlocks.CORK_STAIRS.get());
                            pOutput.accept(ACBlocks.CORK_SLAB.get());
                            pOutput.accept(ACBlocks.CORK_FENCE.get());
                            pOutput.accept(ACBlocks.CORK_FENCE_GATE.get());
                            pOutput.accept(ACBlocks.CORK_DOOR.get());
                            pOutput.accept(ACBlocks.CORK_TRAPDOOR.get());
                            pOutput.accept(ACBlocks.CORK_PRESSURE_PLATE.get());
                            pOutput.accept(ACBlocks.CORK_BUTTON.get());
                            pOutput.accept(ACBlocks.CORK_SIGN.get());
                            pOutput.accept(ACBlocks.CORK_HANGING_SIGN.get());
                            pOutput.accept(ACItems.CORK_BOAT.get());
                            pOutput.accept(ACItems.CORK_CHEST_BOAT.get());

                            pOutput.accept(ACItems.LOTUS_PISTILS.get());
                            pOutput.accept(ACItems.BLEACHDEW.get());
                            pOutput.accept(ACBlocks.BLEACHED_WOOL.get());
                            pOutput.accept(ACBlocks.BLEACHED_CARPET.get());
                            pOutput.accept(ACBlocks.BLEACHED_CONCRETE.get());
                            pOutput.accept(ACBlocks.BLEACHED_CONCRETE_POWDER.get());
                            pOutput.accept(ACBlocks.BLEACHED_BED.get());

                            pOutput.accept(ACItems.POTTERY_SHERD.get());
                            pOutput.accept(ACItems.RUINED_POTTERY_SHERD.get());
                            pOutput.accept(ACItems.ROLL_POTTERY_SHERD.get());
                            pOutput.accept(ACItems.FINALE_POTTERY_SHERD.get());
                            pOutput.accept(ACItems.GATEWAY_POTTERY_SHERD.get());

                            pOutput.accept(ACBlocks.GLAZED_TERRACOTTA.get());
                            pOutput.accept(ACBlocks.TERRACOTTA_SHINGLES.get());
                            pOutput.accept(ACBlocks.TERRACOTTA_SHINGLE_STAIRS.get());
                            pOutput.accept(ACBlocks.TERRACOTTA_SHINGLE_SLAB.get());
                            pOutput.accept(ACBlocks.TERRACOTTA_SHINGLE_WALL.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedTerracottaShingles(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedTerracottaShingleStairs(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedTerracottaShingleSlab(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedTerracottaShingleWall(colour.getId()));
                            }
                            pOutput.accept(ACItems.BLEACHED_CHALK_STICK.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACItems.getChalkStick(colour.getId()));
                            }
                            pOutput.accept(ACBlocks.BLEACHED_CHALK.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getChalk(colour.getId()));
                            }
                            pOutput.accept(ACItems.BLEACHDEW_PAINTBRUSH.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACItems.getPaintBrush(colour.getId()));
                            }
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedFlowerPot(colour.getId()));
                            }
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACItems.getDyedDecoratedPotBlockItem(colour));
                            }
                            pOutput.accept(ACBlocks.GYPSUM.get());
                            pOutput.accept(ACBlocks.GYPSUM_STAIRS.get());
                            pOutput.accept(ACBlocks.GYPSUM_SLAB.get());
                            pOutput.accept(ACBlocks.GYPSUM_WALL.get());
                            pOutput.accept(ACBlocks.POLISHED_GYPSUM.get());
                            pOutput.accept(ACBlocks.POLISHED_GYPSUM_STAIRS.get());
                            pOutput.accept(ACBlocks.POLISHED_GYPSUM_SLAB.get());
                            pOutput.accept(ACBlocks.POLISHED_GYPSUM_WALL.get());
                            pOutput.accept(ACBlocks.GYPSUM_BRICKS.get());
                            pOutput.accept(ACBlocks.GYPSUM_BRICK_STAIRS.get());
                            pOutput.accept(ACBlocks.GYPSUM_BRICK_SLAB.get());
                            pOutput.accept(ACBlocks.GYPSUM_BRICK_WALL.get());

                            pOutput.accept(ACBlocks.PLASTER.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedPlaster(colour.getId()));
                            }

                            pOutput.accept(ACBlocks.SOAPSTONE.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_STAIRS.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_SLAB.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_WALL.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedSoapstone(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneStairs(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneSlab(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneWall(colour.getId()));
                            }
                            pOutput.accept(ACBlocks.POLISHED_SOAPSTONE.get());
                            pOutput.accept(ACBlocks.POLISHED_SOAPSTONE_STAIRS.get());
                            pOutput.accept(ACBlocks.POLISHED_SOAPSTONE_SLAB.get());
                            pOutput.accept(ACBlocks.POLISHED_SOAPSTONE_WALL.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedPolishedSoapstone(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedPolishedSoapstoneStairs(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedPolishedSoapstoneSlab(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedPolishedSoapstoneWall(colour.getId()));
                            }
                            pOutput.accept(ACBlocks.SOAPSTONE_BRICKS.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_BRICK_STAIRS.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_BRICK_SLAB.get());
                            pOutput.accept(ACBlocks.SOAPSTONE_BRICK_WALL.get());
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedSoapstoneBricks(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneBrickStairs(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneBrickSlab(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedSoapstoneBrickWall(colour.getId()));
                            }
                            for (DyeColor colour : CreativeCategoryUtils.colourOrder) {
                                pOutput.accept(ACBlocks.getDyedMudBricks(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedMudBrickStairs(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedMudBrickSlab(colour.getId()));
                                pOutput.accept(ACBlocks.getDyedMudBrickWall(colour.getId()));
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
