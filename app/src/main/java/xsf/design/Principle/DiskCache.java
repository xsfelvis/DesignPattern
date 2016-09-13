package xsf.design.Principle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileOutputStream;

/**
 * 本地缓存
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class DiskCache implements IImageCache {
    static final String cacheDir = "sdcard/cache/";

    //从缓存中获取图片
    @Override
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    //将图片存到缓存
    @Override
    public void put(String url, Bitmap bmp) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseUtils.closeQuietly(fileOutputStream);
            /*if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/
        }
    }

}
