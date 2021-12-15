package LessonElevenTwenthy.LessonFourteen;

//3. Написать программу, которая вместо золушки сортирует числа из начальной коллекции на 3 кучки:
// в первую - числа которые нацело делятся на 2,
// во вторую - числа которые делятся на 3,
// в третью - все остальные, которые не подходят под первые 2.
// Если число делится и на 2 и на 3, то оно попадает в обе кучки.
// Начальную коллекцию из 100 элеметов заполнить случайными числами (граничное значение 500)

import java.util.*;

public class SortingProgram {
    public static void main(String[] args) {
        ArrayList<Integer> originalCollection = new ArrayList(generate());
        ArrayList<Integer> divideTwo = new ArrayList();
        ArrayList<Integer> divideThree = new ArrayList();
        ArrayList<Integer> other = new ArrayList();

        for (Integer element : originalCollection) {
            if (element % 6 == 0) {
                divideTwo.add(element);
                divideThree.add(element);
            } else if (element % 2 == 0) {
                divideTwo.add(element);
            } else if (element % 3 == 0) {
                divideThree.add(element);
            } else {
                other.add(element);
            }
        }

        System.out.println("\n Original collection: " + originalCollection);
        System.out.println("\n Numbers divided by two: " + divideTwo);
        System.out.println("\n Numbers divided by three: " + divideThree);
        System.out.println("\n Numbers not divided by two & three: " + other);
    }

    public static List<Integer> generate() {
        Random random = new Random();
        List<Integer> listWithDuplicates = new ArrayList<>();
        for (int element = 0; element < 100; element++)
            listWithDuplicates.add(random.nextInt(501));

        return listWithDuplicates;
    }
}
