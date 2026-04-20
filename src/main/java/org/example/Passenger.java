package org.example;

public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;


    public Passenger() {
    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
        this.reservedCar = null;
        this.tripCost = 0.0;
    }

    public abstract void passengerReservation(Car car) throws Exception;

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        if (reservedCar == null){
            System.out.println("No car Reserved");
        }else {
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route price: $" + reservedCar.getRoute().getTripPrice());
        }
        System.out.println("Trip Cost: $" + getTripCost());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
}
