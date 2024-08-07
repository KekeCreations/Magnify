package com.kekecreations.magnify;

import com.kekecreations.magnify.common.util.CreativeCategoryUtils;
import com.kekecreations.magnify.core.registry.MagnifyCreativeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Magnify {

    public static final String MOD_ID = "magnify";
    public static final String MOD_NAME = "Magnify";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        CreativeCategoryUtils.addVanillaDyesToColourOrder();
        MagnifyCreativeTabs.register();
    }
}