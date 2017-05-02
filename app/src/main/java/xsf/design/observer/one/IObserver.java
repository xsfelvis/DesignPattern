package xsf.design.observer.one;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public interface IObserver {
    public void update(float temp, float humidity, float pressure);
}
