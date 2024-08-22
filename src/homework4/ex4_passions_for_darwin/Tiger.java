package homework4.ex4_passions_for_darwin;

public class Tiger extends Predator {

    public Tiger(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void attack(Alive alive) throws DeadException {
        if (this.isDead) {
            throw new DeadException();
        } else if (alive.getWeight() > (getWeight() * 2)) {
            this.die();
        } else {
            setWeight(getWeight() + (alive.getWeight() / 3));
            alive.setDead(true);
        }
    }
}