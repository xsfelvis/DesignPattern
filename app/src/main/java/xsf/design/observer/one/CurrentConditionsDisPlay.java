package xsf.design.observer.one;



/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class CurrentConditionsDisPlay implements IObserver,IDisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public CurrentConditionsDisPlay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dispaly();
    }

    @Override
    public void dispaly() {

    }
}
