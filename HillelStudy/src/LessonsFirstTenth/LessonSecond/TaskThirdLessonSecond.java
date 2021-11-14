package LessonsFirstTenth.LessonSecond;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Butko Hanna
 */

public class TaskThirdLessonSecond {
    public static void main(String[] args) {
        Random r = new SecureRandom();

        //Task 3: Create a program that calculates the area of a circle
//        double radius = 3+(17-1)*r.nextDouble();
        double radius = 20;

        //Error in task description
//        double areaCircle = Math.sqrt(Math.PI*radius);

        //Correct formula
        double areaCircle = Math.pow(Math.PI,radius);

        System.out.println("Circle area: " + areaCircle);
    }
}
