import java.util.ArrayList;

/**
 * Created by pc on 15-5-19.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //因为观察者都实现了update方法，所以可以通知他们
    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
