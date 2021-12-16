package LessonsOneTen.LessonThird;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskFourthLessonThird {
    public static void main(String[] args) {
        //Task 4. Triangle. If...else

        int sideOne = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        int sideTwo = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        int sideThree = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        System.out.println("Triangle sides are: " + sideOne + ", " + sideTwo + " and " + sideThree);

        if (sideOne == sideTwo && sideTwo == sideThree ) {
            System.out.println("Equilateral Triangle");
        }else if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne ) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
    }
}

//    Написать программу, которая определяет, является ли треугольник со сторонами a, b, c равнобедренным.
