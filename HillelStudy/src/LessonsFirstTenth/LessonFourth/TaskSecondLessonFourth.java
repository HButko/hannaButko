package LessonsFirstTenth.LessonFourth;

import java.util.Random;

/**
 * @author Butko Hanna
 */

public class TaskSecondLessonFourth {
    public static void main(String[] args) {
        //Task 2. Program that replaces all even numbers with 0 in an array of random numbers

        Random random = new Random();
        int length = 10;
        int[] value = new int[length];

        System.out.println("Original array: ");
        for (int i = 0; i <= length - 1; i++) {
            value[i] = random.nextInt(100);
            System.out.print(" " + value[i]);
        }

        System.out.println("\n Changed array: ");
        for (int i = 0; i <= length - 1; i++) {
            if (value[i] % 2 == 0) {
                value[i] = 0;
            }
            System.out.print(" " + value[i]);
        }
    }
}


//2 Написать программу, которая в массиве из случайных чисел заменяет все чётные числа на 0 и выводит полученный массив на экран.
// Для генерации случайных чисел можно использовать Random:
//		Random random = new Random;
//		int i = random.nextInt(100); //случайное целое число до 100