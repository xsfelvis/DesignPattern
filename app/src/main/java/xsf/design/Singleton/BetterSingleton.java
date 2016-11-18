package xsf.design.Singleton;

/**
 * Author: hzxushangfei
 * Time: created at 2016/11/18.
 * Description:更加优雅的单例
 */

public class BetterSingleton {
    public BetterSingleton() {
    }

    public static BetterSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final BetterSingleton instance = new BetterSingleton();
    }

}
