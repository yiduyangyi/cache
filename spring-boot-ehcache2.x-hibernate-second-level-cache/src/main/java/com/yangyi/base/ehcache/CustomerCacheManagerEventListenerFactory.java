package com.yangyi.base.ehcache;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.event.CacheManagerEventListener;
import net.sf.ehcache.event.CacheManagerEventListenerFactory;

import java.util.Properties;

/**
 * Created by yangjinfeng on 2017/1/5.
 */
public class CustomerCacheManagerEventListenerFactory extends CacheManagerEventListenerFactory {
    @Override
    public CacheManagerEventListener createCacheManagerEventListener(CacheManager cacheManager, Properties properties) {
        return new CustomerCacheManagerEventListener(cacheManager);
    }
}
