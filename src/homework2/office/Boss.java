package homework2.office;

public class Boss {
    String bossName;

    public Boss(String newBossName) {
        this.bossName = newBossName;
    }

    public void bossRushManager(Manager manager){
        System.out.println("Босс " + getBossName() + ": " + manager.getManagerName() + ", быстрее!");
    }

    public String getBossName() {
        return this.bossName;
    }
}