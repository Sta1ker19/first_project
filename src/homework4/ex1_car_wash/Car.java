package homework4.ex1_car_wash;

public class Car extends Vehicle {
    private boolean cruiseControl;

    public Car(boolean clear, double width, double height, double length, boolean cruiseControl) {
        super(clear, width, height, length);
        this.cruiseControl = cruiseControl;
    }
}