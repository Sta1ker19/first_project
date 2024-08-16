package homework3.shop;

public class Shop {
    private final boolean isClearFloor; //Чистый пол
    private final boolean workersHasBadge; //Есть ли бейджики у сотрудников
    private final int countWorkers; //Количество работников в магазине

    protected boolean getIsClearFloor() {
        return isClearFloor;
    }

    protected boolean getIsWorkersHasBadge() {
        return workersHasBadge;
    }

    protected int getCountWorkers() {
        return countWorkers;
    }

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }
}