package homework4.ex4_passions_for_darwin;

abstract class Herbivore extends Alive {

    protected Herbivore(boolean isDead, double weight) {
        super(isDead, weight);
    }

    protected void run() throws DeadException {
        if (this.isDead) {
            throw new DeadException();
        }
    }
}