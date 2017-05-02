package xsf.design.observer.one;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObserver();
}
