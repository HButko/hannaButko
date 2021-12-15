package LessonsOneTen.LessonFourth;

import java.util.Random;

/**
 * @author Butko Hanna
 */

public class TaskThirdLessonFourth {
    public static void main(String[] args) {
        //Task 3. Program that calculates the arithmetic mean of all elements in an array of 10 random numbers

        Random random = new Random();
        int length = 10;
        int[] value = new int[length];
        int sum = 0;

        System.out.println("Original array: ");
        for (int i = 0; i <= length - 1; i++) {
            value[i] = random.nextInt(100);
            System.out.print(" " + value[i]);

            sum = sum + value[i];
        }

        float result = sum / length;
        System.out.println("\n Result: " + result);
    }
}

//3 Написать программу, которая считает среднее арифметическое всех элементов в массиве из 10 случайных чисел.