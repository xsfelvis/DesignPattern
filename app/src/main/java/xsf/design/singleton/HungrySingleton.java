package xsf.design.singleton;

/**
 * Author: 彩笔学长
 * Time: created at 18/11/2016.
 * Description:普通单例之 饿汉模式
 */

public class HungrySingleton {
    public HungrySingleton() {
    }

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

}
