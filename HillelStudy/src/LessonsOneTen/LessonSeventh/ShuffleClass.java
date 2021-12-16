package LessonsOneTen.LessonSeventh;

import LessonsOneTen.LessonNinth.Logger;
import LessonsOneTen.LessonNinth.Status;

import java.util.Random;


public class ShuffleClass {
    public void shuffle(String[] deck, String[] suites, String[] values, int noCards) throws RuntimeException {

        try {
            int count = 0;
            for (String suite : suites) {
                for (String value : values) {
                    deck[count++] = value + " of " + suite;
                }
            }
        } catch (Exception deckError) {
            Logger.setStatus(Status.ERROR);
            System.out.println(Logger.getStatus() + "Wrong deck calculation");
        }

        Random random = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int in = random.nextInt(noCards);
                int out = random.nextInt(noCards);

                String cards = deck[in];
                deck[in] = deck[out];
                deck[out] = cards;
            }
        } catch (Exception cardsError) {
            Logger.setStatus(Status.ERROR);
            System.out.println(Logger.getStatus() + "Wrong cards calculation");
        }
    }
}
