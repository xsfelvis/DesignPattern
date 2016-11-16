package xsf.design.Principle;

import android.graphics.Bitmap;

/**
 * 抽象图片缓存功能
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public interface IImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);
}
