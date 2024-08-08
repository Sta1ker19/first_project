package homework2.office;

public class Secretary {

    public void secretaryActions(Boss boss, Manager manager, SecurityGuard securityGuard) {
        System.out.println("Секретарь: " + boss.getBossName() + ", не волнуйтесь, "
                + manager.getManagerName() + " все успеет. " + securityGuard.getSecurityGuardName() + " - подождите!");
    }
}