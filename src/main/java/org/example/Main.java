package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {









        Route route1 = new Route("Tuwaiq Acadimy" , "Al-Yarmouk" , 50.0);
        Route route2 = new Route("Al-Yarmouk" , "Al-Ghadir" , 45.0);


        Passenger[] passengers = new Passenger[ 2 ];
        passengers[0] = new Subscribers("Adel" , "SubP.001");
        passengers[1] = new NonSubscribers("Moath" , "NonP.001" , true);


        Car[] cars = new Car[2];
        cars[0] = new Car("c.001" , 4 , route1);
        cars[1] = new Car("c.002" , 6 , route2);


        try {

            for (int i=0;i<passengers.length;i++){
                passengers[i].passengerReservation(cars[i]);
                passengers[i].displayInfo();
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}