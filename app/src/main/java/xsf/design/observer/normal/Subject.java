package xsf.design.observer.normal;

import java.util.Vector;


/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description: 被观察者
 */

public abstract class Subject {
    private Vector<Observer> observers;
    //增加一个观察者
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    //删除一个观察者
    public void removeObserver(Observer o) {
        observers.remove(o);

    }
    //通知所有观察者
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }

    }

}
