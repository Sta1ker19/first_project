package homework4.ex2_flight;

class Duck implements Flyable {
    private final boolean isInjured;

    protected Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException();
        }
        System.out.println("Утка летит");
    }
}