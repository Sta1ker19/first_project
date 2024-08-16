package homework3.shop;

class Customer {
    private final String name;

    protected Customer(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void checkShop(Shop shop) {
        if ((shop.getIsClearFloor() && shop.getIsWorkersHasBadge()) ||
                (shop.getIsWorkersHasBadge() && (shop.getCountWorkers() > 2)) ||
                (shop.getIsClearFloor() && (shop.getCountWorkers() > 2))) {
            System.out.println(name + ": Магазин прошел проверку");
        }
        else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}