package homework4.ex1_car_wash;

public class Bus extends Vehicle {
    private int maxCountPassengers;

    public Bus(boolean clear, double width, double height, double length, int maxCountPassengers) {
        super(clear, width, height, length);
        this.maxCountPassengers = maxCountPassengers;
    }
}