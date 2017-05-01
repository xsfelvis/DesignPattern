package xsf.design.principle;

import android.graphics.Bitmap;

/**
 * 抽象图片缓存功能
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public interface IImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);
}
