package homework4.ex4_passions_for_darwin;

abstract class Alive {
    protected boolean isDead;
    protected double weight;

    protected void setDead(boolean dead) {
        isDead = dead;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    protected boolean isDead() {
        return isDead;
    }

    protected double getWeight() {
        return weight;
    }

    protected void die() {
        setDead(true);
    }

    protected Alive(boolean isDead, double weight) {
        this.isDead = isDead;
        this.weight = weight;
    }
}