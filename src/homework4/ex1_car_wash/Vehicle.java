package homework4.ex1_car_wash;

abstract class Vehicle {
    private boolean clear;
    private double width;
    private double height;
    private double length;

    public Vehicle(boolean clear, double width, double height, double length) {
        this.clear = clear;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}