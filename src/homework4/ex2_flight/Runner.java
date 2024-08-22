package homework4.ex2_flight;

public class Runner {
    public static void main(String[] args) {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        try {
            duck1.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: утка ранена");
        }

        try {
            duck2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: утка ранена");
        }

        try {
            airplane1.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: пассажиров в самолёте меньше 0");
        }

        try {
            airplane2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: пассажиров в самолёте меньше 0");
        }
    }
}