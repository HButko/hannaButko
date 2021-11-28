package LessonsFirstTenth.LessonEighth;

import java.util.Random;

/**
 * @author Butko Hanna
 */

//Написать иерархию классов с наследованием для разных типов калькуляторов (базовый, инженерный, финансовый или какой-либо ещё),
// подумать, какие методы в этих классах можно перегрузить или переопределить.

public class FormulasProgram extends FormulasCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        double diameter = random.nextDouble();
        float sideOne = random.nextFloat();
        float sideTwo = random.nextFloat();
        float sideThree = random.nextFloat();
        int side = random.nextInt(30);

        //Count the perimeter of the circle - P=C=2πr=πd
        System.out.println("The diameter of circle is: " + diameter);
        FormulasCalculator calcOne = new FormulasCalculator();
        System.out.println("The calculated perimeter of Circle is: " + calcOne.calculate(diameter));

        //Count the perimeter of the triangle - P=a+b+c
        System.out.printf("%n The sides of triangle is: %f, %f anf %f ", sideOne, sideTwo, sideThree);
        FormulasCalculator calcTwo = new FormulasCalculator();
        System.out.printf("%n The calculated perimeter of triangle is: %f %n", calcTwo.calculate(sideOne, sideTwo, sideThree));

        //Count the perimeter of the square - P=4s
        System.out.printf("%n The side of square is: %d", side);
        FormulasCalculator calcThree = new FormulasCalculator();
        System.out.printf("%n The calculated perimeter of square is: %d%n", calcThree.calculate(side));
    }
}
