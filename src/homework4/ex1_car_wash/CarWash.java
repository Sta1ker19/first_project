package homework4.ex1_car_wash;

public class CarWash {
    private final int tariffLargeVehicles = 4000;
    private final int tariffSmallVehicles = 2000;
    private int countLargeVehicles;
    private int countSmallVehicles;
    private int price;

    public CarWash(int countLargeVehicles, int countSmallVehicles) {
        this.countLargeVehicles = countLargeVehicles;
        this.countSmallVehicles = countSmallVehicles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getTariffLargeVehicles() {
        return tariffLargeVehicles;
    }

    public int getTariffSmallVehicles() {
        return tariffSmallVehicles;
    }

    public int getCountLargeVehicles() {
        return countLargeVehicles;
    }

    public int getCountSmallVehicles() {
        return countSmallVehicles;
    }

    public int getPriceLargeVehicles() {
        return priceLargeVehicles;
    }

    public int getPriceSmallVehicles() {
        return priceSmallVehicles;
    }

    int priceLargeVehicles;
    int priceSmallVehicles;

    int priceLargeVehicle;
    int priceSmallVehicle;

    public void washVehicle(Vehicle largeVehicle, Vehicle smallVehicle) {
        if ((largeVehicle.getLength() > 6) || (largeVehicle.getHeight() > 2.5) || (largeVehicle.getWidth() > 2)) {
            largeVehicle.setClear(true);
            priceLargeVehicle = getTariffLargeVehicles();
            price = priceLargeVehicles;
        }
        if ((smallVehicle.getLength() <= 6) || (smallVehicle.getHeight() <= 2.5) || (smallVehicle.getWidth() <= 2)) {
            smallVehicle.setClear(true);
            priceSmallVehicle = getTariffSmallVehicles();
            price = priceSmallVehicle;
        }
        System.out.println("Стоимость мытья одной машины: " + getPrice());
    }

    public void washVehicles(Vehicle largeVehicles, Vehicle smallVehicles) {
        if ((largeVehicles.getLength() > 6) || (largeVehicles.getHeight() > 2.5) || (largeVehicles.getWidth() > 2)) {
            largeVehicles.setClear(true);
            priceLargeVehicles = getCountLargeVehicles() * getTariffLargeVehicles();
        }
        if ((smallVehicles.getLength() <= 6) || (smallVehicles.getHeight() <= 2.5) || (smallVehicles.getWidth() <= 2)) {
            smallVehicles.setClear(true);
            priceSmallVehicles = getCountSmallVehicles() * getTariffSmallVehicles();
        }
        price = getPriceLargeVehicles() + getPriceSmallVehicles();
        System.out.println("Стоимость мытья всех машин: " + getPrice());
    }
}