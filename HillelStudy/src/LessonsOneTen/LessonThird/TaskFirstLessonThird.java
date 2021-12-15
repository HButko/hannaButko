package LessonsOneTen.LessonThird;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskFirstLessonThird {
    public static void main(String[] args) {
        //Task 1. CheckOddEven. If...else
        System.out.println("BYE");

        int number = ThreadLocalRandom.current().nextInt(1, 15 + 1);

        if (number % 2 == 0){
            System.out.println("Even Number " + number);
        }else{
            System.out.println("Odd Number " + number);
        }
    }
}


//    Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
//        если переменная “number” типа int нечетная. Или “Even Number” если переменная
//        четная. Программа всегда должна перед выходом печатать “BYE”
