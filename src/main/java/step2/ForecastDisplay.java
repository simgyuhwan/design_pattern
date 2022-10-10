package step2;

public class ForecastDisplay implements Observer,DisplayElement{
    private WeatherData weatherData;

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {

    }
}
