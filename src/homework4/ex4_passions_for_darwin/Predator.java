package homework4.ex4_passions_for_darwin;

abstract class Predator extends Alive {

    protected Predator(boolean isDead, double weight) {
        super(isDead, weight);
    }

    public void attack(Alive alive) throws DeadException {
        if (this.isDead) {
            throw new DeadException();
        } else if (alive.getWeight() > getWeight()) {
            this.die();
        } else {
            setWeight(getWeight() + (alive.getWeight() / 3));
            alive.setDead(true);
        }
    }
}