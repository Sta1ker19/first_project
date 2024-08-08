package homework2.office;

public class Office {
    public static void workDay() {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        SecurityGuard securityGuard = new SecurityGuard("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();

        boss.bossRushManager(manager);
        manager.managersShout();
        securityGuard.securityGuardAdvancePayment();
        secretary.secretaryActions(boss, manager, securityGuard);
    }
}