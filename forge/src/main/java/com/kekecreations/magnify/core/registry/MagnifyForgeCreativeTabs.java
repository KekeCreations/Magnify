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
import com.teamabnormals.upgrade_aquatic.core.UpgradeAquatic;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import com.teamabnormals.upgrade_aquatic.core.registry.UAItems;
import com.teamabnormals.upgrade_aquatic.core.registry.UAMobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

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
    if (Services.PLATFORM.isModLoaded(CompatUtils.UPGRADE_AQUATIC)) {
        final Supplier<CreativeModeTab> UPGRADE_AQUATIC_TAB = registerCreativeModeTab("upgrade_aquatic_tab",
                () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(UAItems.THRASHER_TOOTH.get()))
                        .title(Component.translatable("magnify.upgrade_aquatic_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(UAItems.DISC_FRAGMENT_ATLANTIS.get());
                            pOutput.accept(UAItems.MUSIC_DISC_ATLANTIS.get());
                            pOutput.accept(UAItems.PREDATOR_POTTERY_SHERD.get());
                            pOutput.accept(UAItems.MULBERRY.get());
                            pOutput.accept(UAItems.MULBERRY_BREAD.get());
                            pOutput.accept(UAItems.MULBERRY_PIE.get());
                            pOutput.accept(UAItems.MULBERRY_JAM_BOTTLE.get());
                            pOutput.accept(UABlocks.MULBERRY_JAM_BLOCK.get());
                            pOutput.accept(UAItems.ELDER_EYE.get());
                            pOutput.accept(UAItems.PIKE.get());
                            pOutput.accept(UAItems.COOKED_PIKE.get());
                            pOutput.accept(UAItems.PERCH.get());
                            pOutput.accept(UAItems.COOKED_PERCH.get());
                            pOutput.accept(UAItems.LIONFISH.get());
                            pOutput.accept(UAItems.COOKED_LIONFISH.get());
                            pOutput.accept(UAItems.PIKE_BUCKET.get());
                            pOutput.accept(UAItems.PERCH_BUCKET.get());
                            pOutput.accept(UAItems.LIONFISH_BUCKET.get());
                            pOutput.accept(UAItems.NAUTILUS_BUCKET.get());
                            pOutput.accept(UAItems.SQUID_BUCKET.get());
                            pOutput.accept(UAItems.GLOW_SQUID_BUCKET.get());
                            pOutput.accept(UAItems.PIKE_SPAWN_EGG.get());
                            pOutput.accept(UAItems.PERCH_SPAWN_EGG.get());
                            pOutput.accept(UAItems.LIONFISH_SPAWN_EGG.get());
                            pOutput.accept(UAItems.NAUTILUS_SPAWN_EGG.get());
                            pOutput.accept(UAItems.THRASHER_SPAWN_EGG.get());
                            pOutput.accept(UAItems.GREAT_THRASHER_SPAWN_EGG.get());
                            pOutput.accept(UABlocks.GLASS_TRAPDOOR.get());
                            pOutput.accept(UABlocks.GLASS_DOOR.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_LOG.get());
                            pOutput.accept(UABlocks.DRIFTWOOD.get());
                            pOutput.accept(UABlocks.STRIPPED_DRIFTWOOD_LOG.get());
                            pOutput.accept(UABlocks.STRIPPED_DRIFTWOOD.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_PLANKS.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_STAIRS.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_SLAB.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_FENCE.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_FENCE_GATE.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_DOOR.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_TRAPDOOR.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_PRESSURE_PLATE.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_BUTTON.get());
                            pOutput.accept(UABlocks.DRIFTWOOD_SIGNS.getFirst().get());
                            pOutput.accept(UABlocks.DRIFTWOOD_HANGING_SIGNS.getFirst().get());
                            pOutput.accept(UAItems.DRIFTWOOD_BOAT.getFirst().get());
                            pOutput.accept(UAItems.DRIFTWOOD_BOAT.getSecond().get());
                            pOutput.accept(UABlocks.RIVER_LOG.get());
                            pOutput.accept(UABlocks.RIVER_WOOD.get());
                            pOutput.accept(UABlocks.STRIPPED_RIVER_LOG.get());
                            pOutput.accept(UABlocks.STRIPPED_RIVER_WOOD.get());
                            pOutput.accept(UABlocks.RIVER_PLANKS.get());
                            pOutput.accept(UABlocks.RIVER_STAIRS.get());
                            pOutput.accept(UABlocks.RIVER_SLAB.get());
                            pOutput.accept(UABlocks.RIVER_FENCE.get());
                            pOutput.accept(UABlocks.RIVER_FENCE_GATE.get());
                            pOutput.accept(UABlocks.RIVER_DOOR.get());
                            pOutput.accept(UABlocks.RIVER_TRAPDOOR.get());
                            pOutput.accept(UABlocks.RIVER_PRESSURE_PLATE.get());
                            pOutput.accept(UABlocks.RIVER_BUTTON.get());
                            pOutput.accept(UABlocks.RIVER_SIGNS.getFirst().get());
                            pOutput.accept(UABlocks.RIVER_HANGING_SIGNS.getFirst().get());
                            pOutput.accept(UAItems.RIVER_BOAT.getFirst().get());
                            pOutput.accept(UAItems.RIVER_BOAT.getSecond().get());
                            pOutput.accept(UABlocks.RIVER_SAPLING.get());
                            pOutput.accept(UABlocks.RIVER_LEAVES.get());
                            pOutput.accept(UABlocks.KELP_BLOCK.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_STAIRS.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_SLAB.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_WALL.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_BRICKS.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_BRICK_STAIRS.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_BRICK_SLAB.get());
                            pOutput.accept(UABlocks.KELPY_COBBLESTONE_BRICK_WALL.get());
                            pOutput.accept(UABlocks.BEACHGRASS.get());
                            pOutput.accept(UABlocks.TALL_BEACHGRASS.get());
                            pOutput.accept(UABlocks.BEACHGRASS_THATCH.get());
                            pOutput.accept(UABlocks.BEACHGRASS_THATCH_STAIRS.get());
                            pOutput.accept(UABlocks.BEACHGRASS_THATCH_SLAB.get());
                            pOutput.accept(UABlocks.LUMINOUS_PRISMARINE.get());
                            pOutput.accept(UABlocks.LUMINOUS_PRISMARINE_STAIRS.get());
                            pOutput.accept(UABlocks.LUMINOUS_PRISMARINE_SLAB.get());
                            pOutput.accept(UAItems.PRISMARINE_ROD.get());
                            pOutput.accept(UABlocks.PRISMARINE_ROD_BUNDLE.get());
                            pOutput.accept(UABlocks.SCUTE_BLOCK.get());
                            pOutput.accept(UABlocks.SCUTE_SHINGLES.get());
                            pOutput.accept(UABlocks.SCUTE_SHINGLE_STAIRS.get());
                            pOutput.accept(UABlocks.SCUTE_SHINGLE_SLAB.get());
                            pOutput.accept(UABlocks.SCUTE_SHINGLE_WALL.get());
                            pOutput.accept(UABlocks.CHISELED_SCUTE_SHINGLES.get());
                            pOutput.accept(UABlocks.SCUTE_PAVEMENT.get());
                            pOutput.accept(UABlocks.SCUTE_PAVEMENT_STAIRS.get());
                            pOutput.accept(UABlocks.SCUTE_PAVEMENT_SLAB.get());
                            pOutput.accept(UABlocks.SCUTE_PAVEMENT_WALL.get());
                            pOutput.accept(UAItems.THRASHER_TOOTH.get());
                            pOutput.accept(UABlocks.TOOTH_BLOCK.get());
                            pOutput.accept(UABlocks.TOOTH_TRAPDOOR.get());
                            pOutput.accept(UABlocks.TOOTH_DOOR.get());
                            pOutput.accept(UABlocks.TOOTH_LANTERN.get());
                            pOutput.accept(UABlocks.TOOTH_BRICKS.get());
                            pOutput.accept(UABlocks.TOOTH_BRICK_STAIRS.get());
                            pOutput.accept(UABlocks.TOOTH_BRICK_SLAB.get());
                            pOutput.accept(UABlocks.TOOTH_BRICK_WALL.get());
                            pOutput.accept(UABlocks.CHISELED_TOOTH_BRICKS.get());
                            pOutput.accept(UABlocks.TOOTH_TILES.get());
                            pOutput.accept(UABlocks.TOOTH_TILE_STAIRS.get());
                            pOutput.accept(UABlocks.TOOTH_TILE_SLAB.get());
                            pOutput.accept(UABlocks.TOOTH_TILE_WALL.get());
                            pOutput.accept(UABlocks.CORALSTONE.get());
                            pOutput.accept(UABlocks.CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.DEAD_CORALSTONE.get());
                            pOutput.accept(UABlocks.DEAD_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.DEAD_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.DEAD_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.DEAD_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.TUBE_CORALSTONE.get());
                            pOutput.accept(UABlocks.TUBE_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.TUBE_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.TUBE_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.TUBE_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.BRAIN_CORALSTONE.get());
                            pOutput.accept(UABlocks.BRAIN_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.BRAIN_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.BRAIN_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.BRAIN_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.BUBBLE_CORALSTONE.get());
                            pOutput.accept(UABlocks.BUBBLE_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.BUBBLE_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.BUBBLE_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.BUBBLE_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.FIRE_CORALSTONE.get());
                            pOutput.accept(UABlocks.FIRE_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.FIRE_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.FIRE_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.FIRE_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.HORN_CORALSTONE.get());
                            pOutput.accept(UABlocks.HORN_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.HORN_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.HORN_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.HORN_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.ACAN_CORALSTONE.get());
                            pOutput.accept(UABlocks.ACAN_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.ACAN_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.ACAN_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.ACAN_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.FINGER_CORALSTONE.get());
                            pOutput.accept(UABlocks.FINGER_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.FINGER_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.FINGER_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.FINGER_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.STAR_CORALSTONE.get());
                            pOutput.accept(UABlocks.STAR_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.STAR_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.STAR_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.STAR_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.MOSS_CORALSTONE.get());
                            pOutput.accept(UABlocks.MOSS_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.MOSS_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.MOSS_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.MOSS_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.PETAL_CORALSTONE.get());
                            pOutput.accept(UABlocks.PETAL_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.PETAL_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.PETAL_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.PETAL_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.BRANCH_CORALSTONE.get());
                            pOutput.accept(UABlocks.BRANCH_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.BRANCH_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.BRANCH_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.BRANCH_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.ROCK_CORALSTONE.get());
                            pOutput.accept(UABlocks.ROCK_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.ROCK_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.ROCK_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.ROCK_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.PILLOW_CORALSTONE.get());
                            pOutput.accept(UABlocks.PILLOW_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.PILLOW_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.PILLOW_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.PILLOW_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.SILK_CORALSTONE.get());
                            pOutput.accept(UABlocks.SILK_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.SILK_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.SILK_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.SILK_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.CHROME_CORALSTONE.get());
                            pOutput.accept(UABlocks.CHROME_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.CHROME_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.CHROME_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.CHROME_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORALSTONE.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.PRISMARINE_CHISELED_CORALSTONE.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORALSTONE.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORALSTONE_STAIRS.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORALSTONE_SLAB.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORALSTONE_WALL.get());
                            pOutput.accept(UABlocks.CHISELED_ELDER_PRISMARINE_CORALSTONE.get());
                            pOutput.accept(UABlocks.BEDROLL.get());
                            pOutput.accept(UABlocks.WHITE_BEDROLL.get());
                            pOutput.accept(UABlocks.LIGHT_GRAY_BEDROLL.get());
                            pOutput.accept(UABlocks.GRAY_BEDROLL.get());
                            pOutput.accept(UABlocks.BLACK_BEDROLL.get());
                            pOutput.accept(UABlocks.RED_BEDROLL.get());
                            pOutput.accept(UABlocks.ORANGE_BEDROLL.get());
                            pOutput.accept(UABlocks.YELLOW_BEDROLL.get());
                            pOutput.accept(UABlocks.LIME_BEDROLL.get());
                            pOutput.accept(UABlocks.GREEN_BEDROLL.get());
                            pOutput.accept(UABlocks.CYAN_BEDROLL.get());
                            pOutput.accept(UABlocks.LIGHT_BLUE_BEDROLL.get());
                            pOutput.accept(UABlocks.BLUE_BEDROLL.get());
                            pOutput.accept(UABlocks.PURPLE_BEDROLL.get());
                            pOutput.accept(UABlocks.MAGENTA_BEDROLL.get());
                            pOutput.accept(UABlocks.PINK_BEDROLL.get());
                            pOutput.accept(UABlocks.WHITE_SEAROCKET.get());
                            pOutput.accept(UABlocks.PINK_SEAROCKET.get());
                            pOutput.accept(UABlocks.EMBEDDED_AMMONITE.get());
                            pOutput.accept(UABlocks.PICKERELWEED.get());
                            pOutput.accept(UAItems.BOILED_PICKERELWEED.get());
                            pOutput.accept(UABlocks.PICKERELWEED_BLOCK.get());
                            pOutput.accept(UABlocks.BOILED_PICKERELWEED_BLOCK.get());
                            pOutput.accept(UABlocks.ACAN_CORAL.get());
                            pOutput.accept(UABlocks.ACAN_CORAL_FAN.get());
                            pOutput.accept(UABlocks.ACAN_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_ACAN_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_ACAN_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_ACAN_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.FINGER_CORAL.get());
                            pOutput.accept(UABlocks.FINGER_CORAL_FAN.get());
                            pOutput.accept(UABlocks.FINGER_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_FINGER_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_FINGER_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_FINGER_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.STAR_CORAL.get());
                            pOutput.accept(UABlocks.STAR_CORAL_FAN.get());
                            pOutput.accept(UABlocks.STAR_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_STAR_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_STAR_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_STAR_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.MOSS_CORAL.get());
                            pOutput.accept(UABlocks.MOSS_CORAL_FAN.get());
                            pOutput.accept(UABlocks.MOSS_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_MOSS_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_MOSS_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_MOSS_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.PETAL_CORAL.get());
                            pOutput.accept(UABlocks.PETAL_CORAL_FAN.get());
                            pOutput.accept(UABlocks.PETAL_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_PETAL_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_PETAL_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_PETAL_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.BRANCH_CORAL.get());
                            pOutput.accept(UABlocks.BRANCH_CORAL_FAN.get());
                            pOutput.accept(UABlocks.BRANCH_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_BRANCH_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_BRANCH_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_BRANCH_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.ROCK_CORAL.get());
                            pOutput.accept(UABlocks.ROCK_CORAL_FAN.get());
                            pOutput.accept(UABlocks.ROCK_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_ROCK_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_ROCK_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_ROCK_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.PILLOW_CORAL.get());
                            pOutput.accept(UABlocks.PILLOW_CORAL_FAN.get());
                            pOutput.accept(UABlocks.PILLOW_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_PILLOW_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_PILLOW_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_PILLOW_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.SILK_CORAL.get());
                            pOutput.accept(UABlocks.SILK_CORAL_FAN.get());
                            pOutput.accept(UABlocks.SILK_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_SILK_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_SILK_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_SILK_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.CHROME_CORAL.get());
                            pOutput.accept(UABlocks.CHROME_CORAL_FAN.get());
                            pOutput.accept(UABlocks.CHROME_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.DEAD_CHROME_CORAL.get());
                            pOutput.accept(UABlocks.DEAD_CHROME_CORAL_FAN.get());
                            pOutput.accept(UABlocks.DEAD_CHROME_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORAL.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORAL_FAN.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORAL_SHOWER.get());
                            pOutput.accept(UABlocks.PRISMARINE_CORAL_BLOCK.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORAL.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORAL_FAN.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORAL_SHOWER.get());
                            pOutput.accept(UABlocks.ELDER_PRISMARINE_CORAL_BLOCK.get());
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
