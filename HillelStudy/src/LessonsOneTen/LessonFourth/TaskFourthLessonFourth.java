package LessonsOneTen.LessonFourth;

import java.util.Random;

/**
 * @author Butko Hanna
 */

public class TaskFourthLessonFourth {
    public static void main(String[] args) {
        //Task 4. Program that is supposed to simulate the distribution of cards for playing poker

        int noCards = 52;
        int players = 4;

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suites = {"Hearts", "Bells", "Acorns", "Leaves"};

        String[] deck = new String[noCards];

        int count = 0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count++] = value + " of " + suite;
            }
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int in = random.nextInt(noCards);
            int out = random.nextInt(noCards);

            String cards = deck[in];
            deck[in] = deck[out];
            deck[out] = cards;
        }

        count = 0;
        for (int round = 1; round < 6; round++) {
            System.out.printf("%d round", round);
            for (int player = 1; player < players; player++) {
                System.out.printf("Player %d gets %s", player, deck[count++]);
            }
            System.out.println("");
        }
    }
}

//Написать программу, которая должна имитировать раздачу карт для игры в покер. За столом сидят 4 игрока,
// каждый из них получает на руки 5 карт. Карты должны быть случайными и не повторяться. Формат вывода на экран:
//
//“Игрок N получает карту <НАЗВАНИЕ КАРТЫ>”