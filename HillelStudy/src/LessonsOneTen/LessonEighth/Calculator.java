package LessonsOneTen.LessonEighth;

/**
 * @author Butko Hanna
 */

public class Calculator {

    //P=C=2πr=πd
    public double calculate(double diameter) {
        double calcResult;
        calcResult = Math.PI * diameter;
        return calcResult;
    }

    //P=a+b+c
    public float calculate(float sideOne, float sideTwo, float sideThree) {
        float calcResult;
        calcResult = sideOne + sideTwo + sideThree;
        return calcResult;
    }

    //P=4s
    public int calculate(int side) {
        int calcResult;
        calcResult = 4 * side;
        return calcResult;
    }

    //P=2L+2W
    public int calculate(int length, int width) {
        int calcResult;
        calcResult = 2 * length + 2 * width;
        return calcResult;
    }

    public void thanks() {
        System.out.println("Thanks for calculating!");
    }
}

class Thanks extends Calculator {
    public void thanks() {
        super.thanks();
    }
}
