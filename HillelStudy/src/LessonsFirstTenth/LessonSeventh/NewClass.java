package LessonsFirstTenth.LessonSeventh;

import java.util.Random;

public class NewClass {
    public void Shuffle(String[] deck, String[] suites, String[] values, int noCards){

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
    }
}
