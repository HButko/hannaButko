package LessonsOneTen.LessonFourth;

import static java.lang.Math.sin;

/**
 * @author Butko Hanna
 */

public class TaskFirstLessonFourth {
    public static void main(String[] args) {
        //Task 1. Program that prints a table of sin (x) values, where x is every 10 degrees from 0 to 360

        for (int x = 0; x <= 360; x += 10) {
            // Print x value
            System.out.println("Degree value: " + x);

            // Print y value
            System.out.println("Result value: " + sin(x));
        }
    }
}

//1 Написать программу, которая печатает таблицу значений sin(x), где x это каждые 10 градусов от 0 до 360