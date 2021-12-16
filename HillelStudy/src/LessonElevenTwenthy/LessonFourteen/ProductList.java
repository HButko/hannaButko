package LessonElevenTwenthy.LessonFourteen;

//2. Создать программу - список покупок. В список вносится название товара и количество.
// Список заполнить случайными товарами. В конце вывести общее количество товаров, добавленных в список.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ProductList {
    static HashMap<String, Integer> groceryList = new HashMap<>();

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> products = new ArrayList<>();
        products.add("Milk");
        products.add("Coffee");
        products.add("Cake");
        products.add("Shawarma");
        products.add("Donat");
        products.add("Egg");
        products.add("Pizza");

        for (int i = 0; i < 5; i++) {
            String randomProduct = getRandom(products);
            int randomQuantity = random.nextInt(10) + 1;
            addProducts(randomProduct, randomQuantity);
            System.out.println("\n Product: " + randomProduct + " and amount: " + randomQuantity);
        }

        System.out.println("\n Total amount of products: " + count());
    }

    public static void addProducts(String name, Integer quantity) {
        if (groceryList.containsKey(name)) {
            Integer oldQuantity = groceryList.get(name);
            groceryList.put(name, quantity + oldQuantity);
        } else {
            groceryList.put(name, quantity);
        }
    }

    public static Integer count() {
        return groceryList.values().stream().mapToInt(Integer::intValue).sum();
    }

    public static String getRandom(ArrayList<String> array) {
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }
}