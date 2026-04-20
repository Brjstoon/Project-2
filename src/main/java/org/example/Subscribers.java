package org.example;

public class Subscribers extends Passenger{

    public Subscribers(String name , String id) {
        super(name , id);
    }

    public Subscribers() {
    }

    @Override
    public void passengerReservation(Car car) throws Exception {
        if (car.getCapacity() == 0 ){
            throw new Exception("Car is Full!");
        }

        this.setReservedCar(car);
        car.decrementCapacity();
        double price = car.getRoute().getTripPrice();
        this.setTripCost(price - (price * 0.5));
    }

    @Override
    public void displayInfo() {

        System.out.println("========= Subscriber Passenger =========");
        super.displayInfo();
        System.out.println("Discount 50%");
        System.out.println();
    }


}
