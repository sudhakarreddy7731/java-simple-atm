package VECHILE_MANAGEMENT;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Toyota"),
                new Bike("Honda"),
                new Truck("Tata"),
                new Bus("Volvo"),
                new ElectricCar("Tesla")
        };

        for (Vehicle v : vehicles) {
            v.displayBrand();
            v.startEngine();
            System.out.println("-------------------");
        }
    }
}