package LessonsOneTen.LessonNinth;

import LessonsOneTen.LessonEighth.Calculator;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(100);
        int width = random.nextInt(100);

        System.out.printf("%n The length and width of rectangle is: %d and %d %n", length, width);
        Calculator calc = new Calculator();
        int result = calc.calculate(length, width);

        System.out.println("The result of calculation is " + result);

        if (result > 100) {
            Logger.setStatus(Status.DEBUG);
            System.out.println(Logger.getStatus());
        } else if (result <= 99 && result >= 50) {
            Logger.setStatus(Status.INFO);
            System.out.println(Logger.getStatus());
        } else if (result <= 49) {
            Logger.setStatus(Status.WARN);
            System.out.println(Logger.getStatus());
        } else {
            Logger.setStatus(Status.ERROR);
            System.out.println(Logger.getStatus());
        }

        System.out.println();
    }
}
