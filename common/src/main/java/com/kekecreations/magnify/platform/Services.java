package com.kekecreations.magnify.platform;

import com.kekecreations.magnify.Magnify;
import com.kekecreations.magnify.platform.services.IPlatformHelper;
import com.kekecreations.magnify.platform.services.IRegistryHelper;

import java.util.ServiceLoader;

public class Services {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static final IRegistryHelper REGISTRY = load(IRegistryHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        Magnify.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}