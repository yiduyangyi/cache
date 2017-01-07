package com.yangyi.base.ehcache;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheManagerEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * ehcache customer cacheManagerEventListener
 * Created by yangjinfeng on 2017/1/5.
 */
public class CustomerCacheManagerEventListener implements CacheManagerEventListener {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final CacheManager cacheManager;

    public CustomerCacheManagerEventListener(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void init() throws CacheException {
        logger.info("init ehcache...");
    }

    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public void dispose() throws CacheException {
        logger.info("ehcache dispose...");
    }

    @Override
    public void notifyCacheAdded(String s) {
        logger.info("cacheAdded... {}", s);
        logger.info(cacheManager.getCache(s).toString());
    }

    @Override
    public void notifyCacheRemoved(String s) {

    }
}
