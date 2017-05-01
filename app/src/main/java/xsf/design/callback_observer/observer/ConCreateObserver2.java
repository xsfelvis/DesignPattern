package xsf.design.callback_observer.observer;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class ConCreateObserver2 implements IObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserver2获得更新");
    }
}
