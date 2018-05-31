package main.java.mytaxi.app.model;

import main.java.mytaxi.app.types.CarType;

public class Driver {

    private String name;
    private String phone;
    private Car car;
    private CarType carType;

    public Driver() {
    }

    public Driver(String name, String phone, Car car, CarType carType) {
        this.name = name;
        this.phone = phone;
        this.car = car;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
