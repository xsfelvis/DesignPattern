package xsf.design.callback_observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class Subject {
    List<IObserver> observers = new ArrayList<>();

    //注册一个事件
    public void register(IObserver observer) {
        observers.add(observer);
    }
    //移除一个事件
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    //通知事件
    public void notifyUpdate() {
        for(IObserver observer : observers) {
            observer.update();
        }
    }
}
