package xsf.design.principle;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 内存缓存
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class MemoryCache implements IImageCache {
    private LruCache<String, Bitmap> mMemoryCache;

    public MemoryCache() {
        //初始化LRU缓存
        initImageCache();
    }

    private void initImageCache() {
        //Runtime.getRuntime()获取JVM当前运行环境，java中唯一获取运行环境的方法
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 4;
        mMemoryCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    @Override
    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bmp) {
        mMemoryCache.put(url, bmp);
    }


}
