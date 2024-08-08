package homework2.office;

public class Manager {
    String managerName;

    public Manager(String newManagerName) {
        this.managerName = newManagerName;
    }

    public void managersShout() {
        System.out.println("Менеджер " + getManagerName() + ": я ничего не успеваю, помогите!");
    }

    public String getManagerName() {
        return this.managerName;
    }
}
