package xsf.design.observer.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class TestObserverClient {
    public static void main(String[] args) {
        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //定义一个观察者
        Observer observer = new ConcreteObserver();
        //观察者观察被观察者
        subject.registerObserver(observer);
        //观察者开始活动了
        subject.doSomeThing();
    }
}
