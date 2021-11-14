package LessonsFirstTenth.LessonSecond;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Butko Hanna
 */

public class TaskSecondLessonSecond {
    public static void main(String[] args) {
        //Task 2: Create a program that prints the area of a right-angled triangle
        int sideOne = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        int sideTwo = ThreadLocalRandom.current().nextInt(5, 20 + 1);
//        int sideOne = 6;
//        int sideTwo = 10;
        int areaTriangle = (sideOne*sideTwo)/2;
        System.out.println("Right-angled triangle area: " + areaTriangle + "cm.");
    }
}
