package oop;

import javax.cache.Caching;
import javax.cache.spi.CachingProvider;

public class Cache {

    public static void configureCacheProvider() {
        // Get the default caching provider
        CachingProvider cachingProvider = Caching.getCachingProvider();

        // You can also specify a caching provider by name
        // CachingProvider cachingProvider = Caching.getCachingProvider("org.ehcache.jsr107.EhcacheCachingProvider");

        // Optional: Perform additional configuration if needed
        // ...

        // Ensure that the caching provider is initialized
        cachingProvider.getCacheManager();
    }

}


