package xsf.design.singleton;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class BetterSingleton2 {
    private static  BetterSingleton2 BETTER_SINGLETON_2 = new BetterSingleton2();

    private BetterSingleton2() {
    }

    public static BetterSingleton2 getInstance() {
        return BETTER_SINGLETON_2;
    }
}
