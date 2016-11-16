package xsf.design.Principle;

import java.io.Closeable;
import java.io.IOException;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
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
