package com.kekecreations.magnify.common.util;

import java.util.ArrayList;
import net.minecraft.world.item.DyeColor;

public class CreativeCategoryUtils {
    public static ArrayList<DyeColor> colourOrder = new ArrayList();

    public CreativeCategoryUtils() {
    }

    public static void addDyeToColourOrder(DyeColor color, int index) {
        colourOrder.add(index, color);
    }

    public static void addVanillaDyesToColourOrder() {
        colourOrder.add(DyeColor.WHITE);
        colourOrder.add(DyeColor.LIGHT_GRAY);
        colourOrder.add(DyeColor.GRAY);
        colourOrder.add(DyeColor.BLACK);
        colourOrder.add(DyeColor.BROWN);
        colourOrder.add(DyeColor.RED);
        colourOrder.add(DyeColor.ORANGE);
        colourOrder.add(DyeColor.YELLOW);
        colourOrder.add(DyeColor.LIME);
        colourOrder.add(DyeColor.GREEN);
        colourOrder.add(DyeColor.CYAN);
        colourOrder.add(DyeColor.LIGHT_BLUE);
        colourOrder.add(DyeColor.BLUE);
        colourOrder.add(DyeColor.PURPLE);
        colourOrder.add(DyeColor.MAGENTA);
        colourOrder.add(DyeColor.PINK);
    }
}
