package org.example;

public class NonSubscribers extends Passenger{

    private boolean discount;


    public NonSubscribers(String name, String id, boolean discount) {
        super(name, id);
        this.discount = discount;
    }

    @Override
    public void passengerReservation(Car car) throws Exception {
        if (car.getCapacity() == 0){
            throw new Exception("Car is Full!");
        }

        this.setReservedCar(car);
        car.decrementCapacity();

        double price = car.getRoute().getTripPrice();
        if (discount){
            this.setTripCost(price - (price * 0.1));
        }else {
            this.setTripCost(price);
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("========= Non Subscribered Passenger =========");
        super.displayInfo();
        if (discount) System.out.println("Discount: 10%");
        else System.out.println("No Discount");
        System.out.println();
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
