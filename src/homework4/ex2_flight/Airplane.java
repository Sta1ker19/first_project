package homework4.ex2_flight;

class Airplane implements Flyable {
    private final int countPassengers;

    protected Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException();
        }
        System.out.println("Самолёт летит");
    }
}