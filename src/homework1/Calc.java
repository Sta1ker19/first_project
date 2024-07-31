package homework1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String mathSymbol = scanner.nextLine();
        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();

        if (mathSymbol.equals("+")) {
            System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
        } else if (mathSymbol.equals("-")) {
            System.out.println("Разность чисел: " + (firstNumber - secondNumber));
        } else if (mathSymbol.equals("*")) {
            System.out.println("Произведение чисел: " + (firstNumber * secondNumber));
        } else if (mathSymbol.equals("/")) {
            System.out.println("Результат деления чисел: " + (firstNumber / secondNumber));
        } else { System.out.println("Ошибка");
        }

        scanner.close();
    }
}