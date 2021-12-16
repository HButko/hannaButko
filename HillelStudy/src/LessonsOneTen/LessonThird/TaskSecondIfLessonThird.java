package LessonsOneTen.LessonThird;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskSecondIfLessonThird {
    public static void main(String[] args) {
        //Task 2. PrintMonthInWord. If...else

        int month = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        System.out.println("Month number is " + month);

        if(month == 1){
            System.out.println("JAN");
        }else if(month == 2){
            System.out.println("FEB");
        }else if(month == 3){
            System.out.println("MAR");
        }else if(month == 4){
            System.out.println("APR");
        }else if(month == 5){
            System.out.println("MAY");
        }else if(month == 6){
            System.out.println("JUN");
        }else if(month == 7){
            System.out.println("JUL");
        }else if(month == 8){
            System.out.println("AUG");
        }else if(month == 9){
            System.out.println("SEP");
        }else if(month == 10){
            System.out.println("OCT");
        }else if(month == 11){
            System.out.println("NOV");
        }else if(month == 12){
            System.out.println("DEC");
        }else{
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
