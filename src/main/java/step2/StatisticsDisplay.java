package step2;

public class StatisticsDisplay implements DisplayElement, Observer{
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
