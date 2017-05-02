package xsf.design.observer.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description: 具体被观察者
 */

public class ConcreteSubject extends Subject {
    //具体业务
    public void doSomeThing() {
        super.notifyObserver();
    }
}
