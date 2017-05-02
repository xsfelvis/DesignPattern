package xsf.design.observer.one;

import java.util.ArrayList;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class WeatherData implements ISubject {
    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);

    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(temperature,humidity,pressure);
        }

    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
