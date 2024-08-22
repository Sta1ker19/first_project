package homework4.ex4_passions_for_darwin;

public class Elephant extends Herbivore {

    public Elephant(boolean isDead, double weight) {
        super(isDead, weight);
    }

    @Override
    public void run() throws DeadException {
        super.run();
        System.out.println("Слон медленно бежит");
    }
}