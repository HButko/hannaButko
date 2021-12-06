package LessonsFirstTenth.LessonSeventh;

import LessonsFirstTenth.LessonTenth.ErrorException;

/**
 * @author Butko Hanna
 */

//В нашей программе для покер машины есть потенциальные места, где могут возникать ошибки,
// а также такие, где можно выбросить свои исключения.
//Задача заключается в обнаружении таких мест, написании и внедрении своих исключений,
// а также их обработка в вызывающем методе.

public class TaskOneLessonSeventh extends ShuffleClass {
    public static void main(String[] args) throws ErrorException {
        //Task 4. Program that is supposed to simulate the distribution of cards for playing poker

        int noCards = 52;
        int players = 4;

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suites = {"Hearts", "Bells", "Acorns", "Leaves"};

        String[] deck = new String[noCards];

        ShuffleClass shuffle = new ShuffleClass();
        shuffle.shuffle(deck, suites, values, noCards);

        ResultPrint print = new ResultPrint();
        print.result();

        int count = 0;
        try {
            for (int round = 1; round < 6; round++) {
                System.out.printf("%d round: ", round);
                for (int player = 1; player < players; player++) {
                    System.out.printf("Player %d gets %s, ", player, deck[count++]);
                }
                System.out.println("");
            }
        } catch (ErrorException errorException) {
            throw new ErrorException("Wrong round calculation");
        } finally {
            System.out.println("The 'try-catch' is finished!");
        }
    }
}
