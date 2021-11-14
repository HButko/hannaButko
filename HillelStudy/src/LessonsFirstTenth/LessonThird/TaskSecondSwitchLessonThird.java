package LessonsFirstTenth.LessonThird;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskSecondSwitchLessonThird {
    public static void main(String[] args) {
        //Task 2. PrintMonthInWord. Switch

        int month = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        System.out.println("Month number is " + month);

        switch (month) {
            case 1 :
                System.out.println("JAN");
                break;

            case 2 :
                System.out.println("FEB");
                break;

            case 3 :
                System.out.println("MAR");
                break;

            case 4 :
                System.out.println("APR");
                break;

            case 5 :
                System.out.println("MAY");
                break;

            case 6 :
                System.out.println("JUN");
                break;

            case 7 :
                System.out.println("JUL");
                break;

            case 8 :
                System.out.println("AUG");
                break;

            case 9 :
                System.out.println("SEP");
                break;

            case 10 :
                System.out.println("OCT");
                break;

            case 11 :
                System.out.println("NOV");
                break;

            case 12 :
                System.out.println("DEC");
                break;

            default:
                System.out.println("Not a valid month");
        }
    }
}

//    Написать программу с названием “PrintMonthInWord”, которая печатает “JAN”,
//        “FEB”, …. “DEC”, если переменная “month” типа int будет 1, 2, 3, 4 … 12.. В
//        противном случае программа должна вывести “Not a valid month”. Решить задачу двумя
//        способами:
//        1) с использованием if..else if
//        2) с использованием switch-case

