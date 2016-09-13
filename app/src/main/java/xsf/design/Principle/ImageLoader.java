package xsf.design.Principle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class ImageLoader {
    IImageCache mImageCache = new MemoryCache();//默认
    /*//内存缓存
    ImageCache mImageCache = new ImageCache();
    //sd卡缓存
    DiskCache mDiskCache = new DiskCache();
    //双缓存
    DouleCache mDouleCache = new DouleCache();
    boolean isUseDouble = false;
    boolean isUseDiskCache = false;*/
    //LruCache<String, Bitmap> mImageCache;
    //获取可用cpu的数量
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    /* public ImageLoader() {
         initImageCache();
     }*/
    public void setmImageCache(IImageCache cache) {
        mImageCache = cache;
    }


    /**
     * 初始化图片缓存
     *//*
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
    }*/

    /*
     *execute(Runnable x)没有返回值
     *submit(Runnable x)返回一个future 可以用来判断任务是否执行成功
     */
    public void displayImage(final String url, final ImageView imageView) {
        //判断使用哪种缓存
        //Bitmap bitmap = isUseDiskCache ? mDiskCache.get(url) : mImageCache.get(url);
        Bitmap bitmap = null;
      /*  if (isUseDouble) {
            bitmap = mDouleCache.get(url);
        } else if (isUseDiskCache) {
            bitmap = mDiskCache.get(url);
        }else{
            bitmap =mImageCache.get(url);
        }*/
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        //没有缓存则需要下载
        imageView.setTag(url);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(url)) {
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url, bitmap);

            }
        });
    }

    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bitmap;
    }

/*    public void userDiskCache(boolean useDiskCache) {
        isUseDiskCache = useDiskCache;
    }

    public void useDoubleCache(boolean useDouble) {
        isUseDiskCache = useDouble;
    }*/
}
