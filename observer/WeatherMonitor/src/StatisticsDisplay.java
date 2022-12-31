public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure =weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees, " + humidity + "% humidity, and " + pressure + " pressure.");
    }
}

