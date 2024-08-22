package homework4.ex4_passions_for_darwin.separate_package;

import homework4.ex4_passions_for_darwin.*;

public class Runner {
    public static void main(String[] args) throws DeadException {

        Tiger tiger = new Tiger(false, 300);
        Wolf wolf = new Wolf(false, 50);
        Rabbit rabbit = new Rabbit(false, 2);
        Elephant elephant = new Elephant(false, 2000);

        try {
            rabbit.run();
        } catch (DeadException e) {
            System.out.println("Животное не может бегать");
        }

        try {
            wolf.attack(rabbit);
        } catch (DeadException e) {
            System.out.println("Животное не может нападать");
        }

        try {
            tiger.attack(wolf);
        } catch (DeadException e) {
            System.out.println("Животное не может нападать");
        }

        try {
            tiger.attack(elephant);
        } catch (DeadException e) {
            System.out.println("Животное не может нападать");
        }

        try {
            elephant.run();
        } catch (DeadException e) {
            System.out.println("Животное не может бегать");
        }

        try {
            rabbit.run();
        } catch (DeadException e) {
            System.out.println("Животное не может бегать");
        }
    }
}