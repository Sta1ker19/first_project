package homework1;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
    }

    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";

        String nameWithoutBlanks = name.trim();
        String nameWithoutBlanksUpperCase = nameWithoutBlanks.toUpperCase();
        String nameWithoutBlanksLowerCase = nameWithoutBlanks.toLowerCase();

        if (nameWithoutBlanksLowerCase.contains("ова ")) {
            System.out.println("Уважаемая " + nameWithoutBlanksUpperCase);
        } else if (nameWithoutBlanksLowerCase.contains("ов ")) {
            System.out.println("Уважаемый " + nameWithoutBlanksUpperCase);
        } else {
            System.out.println("Неизвестное лицо " + nameWithoutBlanksUpperCase);
        }
    }

    public static void ex3() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        &&  (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        String simplyReplace = simply.replace("this is", "those are");
        System.out.println("Индекс второй буквы 'o' в строке: "
                + simplyReplace.indexOf("o", simplyReplace.indexOf("o") + 1));
    }
}