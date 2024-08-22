package homework4.ex4_passions_for_darwin;

public class Rabbit extends Herbivore {

    public Rabbit(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void run() throws DeadException {
        super.run();
        System.out.println("Кролик быстро бежит");
    }
}