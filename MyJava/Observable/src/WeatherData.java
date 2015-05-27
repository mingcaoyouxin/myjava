import java.util.Observable;

/**
 * Created by pc on 15-5-21.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //我们不再需要追踪观察者了，也不需要管理注册与删除，让超类代劳即可，所以我们把注册，添加通知的相关代码删除
    public WeatherData() { }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();//我们没有调用notifyObservers传递数据对象，这表示我们采用的做法是“拉”，而不是“推”
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
