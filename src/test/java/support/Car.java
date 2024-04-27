package support;

public class Car {

    String make;
    String model;
    int year;

    int fuelLevel;
    int distance;

    // Constructor
    public Car(String carMake, String carModel, int carYear) {
        this.make = carMake;   // "this" refers to the current object
        this.model = carModel;
        this.year = carYear;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }



    public static void main(String[] args) {
        // Creating an object of Car class using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2022);
        // Displaying car details
        myCar.displayDetails();
    }

    public static void mortgageCalc () {
        int principal;
        int annualInterest;
        int period;



    }


}
