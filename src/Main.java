import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "Manual", "Sedan", "с865мк", 4, true);
        Car.Key key1 = car1.new Key(true, true);
        System.out.println(car1);
        System.out.println();
        int month = 11;
        car1.changeTires(month);
        System.out.println(car1);
        System.out.println(key1);
    }
}