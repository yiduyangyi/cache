package com.yangyi.base.ehcache;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

import java.util.Properties;

/**
 * Created by yangjinfeng on 2017/1/5.
 */
public class CustomerCacheEventListenerFactory extends CacheEventListenerFactory {
    @Override
    public CacheEventListener createCacheEventListener(Properties properties) {
        return new CustomerCacheEventListener();
    }
}
