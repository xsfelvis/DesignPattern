package xsf.design.Principle;

import android.graphics.Bitmap;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class DouleCache implements IImageCache {
    //内存缓存
    ImageCache mImageCache = new ImageCache();
    //sd卡缓存
    DiskCache mDiskCache = new DiskCache();

    //先从内存缓存中获取，如果没有则从SD卡中获取
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    //将图片缓存到内存和sd卡中
    @Override
    public void put(String url, Bitmap bmp) {
        mImageCache.put(url, bmp);
        mDiskCache.put(url, bmp);
    }
}
