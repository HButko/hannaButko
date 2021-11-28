package LessonsFirstTenth.LessonEighth;

/**
 * @author Butko Hanna
 */

class FormulasCalculator {

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
}
