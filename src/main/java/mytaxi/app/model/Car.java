package mytaxi.app.model;

import mytaxi.app.types.CarType;

public class Car {

    private String name;
    private CarType type;

    public Car() {
    }

    public Car(String name, CarType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
