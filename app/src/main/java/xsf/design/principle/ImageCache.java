package xsf.design.principle;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 图片缓存
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class ImageCache {
    //图片URL缓存
    LruCache<String, Bitmap> mImageCache;

    public ImageCache() {
        initImageCache();
    }

    private void initImageCache() {
        //Runtime.getRuntime()获取JVM当前运行环境，java中唯一获取运行环境的方法
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    public void put(String url,Bitmap bitmap){
        mImageCache.put(url,bitmap);
    }

    public Bitmap get(String url){
        return mImageCache.get(url);
    }
}
