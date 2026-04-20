package org.example;

public class Car {

    private String code;
    private int capacity;
    private Route route;

    public Car(String code, int capacity, Route route) {
        this.code = code;
        this.capacity = capacity;
        this.route = route;
    }

    public void decrementCapacity(){
        if (capacity > 0 ) capacity--;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Car Model: " + code + ", Capacity: " + capacity + ", route: " + route;
    }
}
