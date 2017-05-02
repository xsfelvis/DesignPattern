package xsf.design.observer.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
