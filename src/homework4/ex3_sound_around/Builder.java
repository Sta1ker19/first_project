package homework4.ex3_sound_around;

class Builder extends Human implements WhichMakeSounds {

    @Override
    public void makeSound() {
        System.out.println("Я строитель");
        super.makeSound();
    }
}