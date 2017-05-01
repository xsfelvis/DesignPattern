package xsf.design.principle;

import java.io.Closeable;
import java.io.IOException;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public final class CloseUtils {
    private CloseUtils() {
    }

    /**
     * 关闭closeable对象
     *
     * @param closeable
     */
    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
