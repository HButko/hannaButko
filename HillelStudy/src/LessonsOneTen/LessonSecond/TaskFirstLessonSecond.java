package LessonsOneTen.LessonSecond;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Butko Hanna
 */

public class TaskFirstLessonSecond {
    public static void main(String[] args) {
        Random r = new SecureRandom();

        //Task 1: Create a program that converts Celsius to Fahrenheit and Kelvin
        float celsius = 1+r.nextFloat()*(100-1);
//        float celsius = 5;
        float fahrenheit = ((celsius*9)/5)+32;
        double kelvin = (celsius+273.15);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F and " + kelvin + "°K.");
    }
}
