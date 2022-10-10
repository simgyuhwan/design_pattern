package step2;

public interface Observer {

    // 온도, 습도, 기압
    public void update(float temp, float humidity, float pressure);
}
