package homework4.ex3_sound_around;

public class Runner {
    public static void main(String[] args) {

        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        WhichMakeSounds[] whichMakeSounds = new WhichMakeSounds[4];
        whichMakeSounds[0] = human;
        whichMakeSounds[1] = builder;
        whichMakeSounds[2] = driver;
        whichMakeSounds[3] = bird;

        for (WhichMakeSounds whichMakeSound : whichMakeSounds) {
            whichMakeSound.makeSound();
        }
    }
}