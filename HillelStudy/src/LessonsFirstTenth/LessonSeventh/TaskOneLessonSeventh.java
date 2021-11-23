package LessonsFirstTenth.LessonSeventh;

/**
 * @author Butko Hanna
 */

//Написать свой новый класс (или классы), которые можно использовать в рассмотренной
// на прошлом занятии задаче про игральные карты для покера.
// Внедрить эти классы и переписать программу с ними.

public class TaskOneLessonSeventh extends ShuffleClass {
    public static void main(String[] args) {
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
        for (int round = 1; round < 6; round++) {
            System.out.printf("%d round ", round);
            for (int player = 1; player < players; player++) {
                System.out.printf("Player %d gets %s ", player, deck[count++]);
            }
            System.out.println("");
        }
    }
}
