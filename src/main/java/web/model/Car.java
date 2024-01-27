package web.model;

public class Car {
    private String model;
    private int speed;
    private int year;

    public Car(String model, int speed, int year) {
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
