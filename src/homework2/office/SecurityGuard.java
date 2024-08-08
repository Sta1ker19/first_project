package homework2.office;

public class SecurityGuard {
    String securityGuardName;

    public SecurityGuard(String newSecurityGuardName) {
        this.securityGuardName = newSecurityGuardName;
    }

    public void securityGuardAdvancePayment() {
        System.out.println("Охранник " + getSecurityGuardName() + ": Выдайте мне аванс!");
    }

    public String getSecurityGuardName() {
        return this.securityGuardName;
    }
}