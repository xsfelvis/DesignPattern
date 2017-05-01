package xsf.design.callback_observer.observer;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class ConCreateObserver1 implements IObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserver1获得更新");
    }
}
