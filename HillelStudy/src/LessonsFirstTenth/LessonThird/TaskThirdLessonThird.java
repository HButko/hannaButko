package LessonsFirstTenth.LessonThird;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskThirdLessonThird {
    public static void main(String[] args) {
        //Task 3. Magnitude. ? :

        int numberOne = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        int numberTwo = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        System.out.println("Before magnitude calculating numbers are " + numberOne +
                " and " + numberTwo);
        int result = (numberOne > numberTwo) ? numberOne : numberTwo;
        System.out.println("The greatest number: " + result);
    }
}



//    Написать программу которая будет сравнивать величину (magnitude) двух чисел.
//        Например, если одно число = 3, а второе число = -9, программа должна выдать, что
//        число -9 имеет большую величину.
//        Для вычисления абсолютного значения можно использовать метод из стандартной библиотеки Math.abs()
