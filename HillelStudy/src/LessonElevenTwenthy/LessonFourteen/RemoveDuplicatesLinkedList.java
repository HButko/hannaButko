package LessonElevenTwenthy.LessonFourteen;

//1. Написать программу, которая удаляет из коллекции целых чисел все дубликаты, если они есть.
// Коллекцию из 100 элементов заполнить случайными числами (граница - 20).
// Вывести обе коллекции на экран и количество удалённых дубликатов
// (при желании - решить несколькими способами и сравнить какой из них быстрее)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RemoveDuplicatesLinkedList {
    public static List<Integer> removing(List<Integer> listWithDuplicates) {
        return listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> generate() {
        Random random = new Random();
        List<Integer> listWithDuplicates = new LinkedList<>();
        for (int element = 0; element < 100; element++)
            listWithDuplicates.add(random.nextInt(21));

        return listWithDuplicates;
    }

    public static void main(String[] args) {
        List<Integer> listWithDuplicates = generate();
        System.out.println("\n Original list: " + listWithDuplicates);

        long start = System.nanoTime();

        List<Integer> listWithoutDuplicates = removing(listWithDuplicates);

        System.out.println("\n Removing duration: " + (System.nanoTime()-start));

        System.out.println("\n List without duplicates: " + listWithoutDuplicates);
        System.out.println("\n Removing result: " + (listWithDuplicates.size() - listWithoutDuplicates.size()));
    }
}
