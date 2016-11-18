package xsf.design.Singleton;

/**
 * Author: 彩笔学长
 * Time: created at 18/11/2016.
 * Description: 普通单例之懒汉模式
 */

public class LazySingleton {
    private static LazySingleton instance = null;

    public LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
