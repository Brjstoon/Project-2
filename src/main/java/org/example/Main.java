package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);





//        Passenger[] passengers = new Passenger[ 2 ];
//        passengers[0] = new Subscribers("Adel" , "SubP.001");
//        passengers[1] = new NonSubscribers("Moath" , "NonP.001" , true);



        Passenger passenger = null;

        System.out.println("--------- Car Pooling System ---------");
        System.out.println("Do you have a subscribtion ?  Enter (y) if you are or (n) if you aren't");
        String v = sc.nextLine();

        if (v.equalsIgnoreCase("y")){
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your ID: ");
            String id = sc.nextLine();
            passenger = new Subscribers(name , id);

        } else if (v.equalsIgnoreCase("n")) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your ID: ");
            String id = sc.nextLine();

            System.out.println("Do You Have a Discount Coupon ?  Enter (y) If You Are Or (n) If You Aren't");
            v = sc.nextLine();
            if (v.equalsIgnoreCase("y")){
                passenger = new NonSubscribers(name , id , true);
            }else if (v.equalsIgnoreCase("n")) {
                passenger = new NonSubscribers(name , id , false);

            }
        }


        Route[] routes = new Route[5];
        routes[0] = new Route("King Khalid International Airport" , "Kingdom Centre, Al Olaya" , 80.0);
        routes[1] = new Route("King Saud University" , "Riyadh Park Mall, Al Aqiq" , 35.0);
        routes[2] = new Route("Riyadh Park Mall, Al Aqiq" , "Alfaisal University, Al Maather" , 50.0);
        routes[3] = new Route("Alfaisal University, Al Maather" , "Dr. Sulaiman Al Habib Hospital, Al Olaya" , 45.0);
        routes[4] = new Route("Dr. Sulaiman Al Habib Hospital, Al Olaya" , "Riyadh Hospital, Al Mughrizat" , 60.0);








        for (int i=0;i< routes.length;i++){
            System.out.println(routes[i]);
        }
        System.out.println("Chose a Route:-");

        int choice;
        choice = sc.nextInt();
        Car[] cars = new Car[10];
        cars[0]  = new Car("Toyota Camry",      4, routes[choice]);
        cars[1]  = new Car("Honda Civic",       3, routes[choice]);
        cars[2]  = new Car("Toyota Corolla",    5, routes[choice]);
        cars[3]  = new Car("Hyundai Sonata",    2, routes[choice]);
        cars[4]  = new Car("Kia Optima",        4, routes[choice]);
        cars[5]  = new Car("Nissan Altima",     3, routes[choice]);
        cars[6]  = new Car("GMC Yukon",         6, routes[choice]);
        cars[7]  = new Car("Ford Taurus",       3, routes[choice]);
        cars[8]  = new Car("Chevrolet Malibu",  5, routes[choice]);
        cars[9]  = new Car("Mitsubishi Galant", 3, routes[choice]);

        for (int i=1;i< cars.length+1;i++){

            System.out.println(i + ". " + cars[i-1]);
        }
        System.out.println("Chose a Car:-");
        choice = sc.nextInt() -1;



        try {


            passenger.passengerReservation(cars[choice]);
            passenger.displayInfo();


//            for (int i=0;i<passengers.length;i++){
//                passengers[i].passengerReservation(cars[i]);
//                passengers[i].displayInfo();
//            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}