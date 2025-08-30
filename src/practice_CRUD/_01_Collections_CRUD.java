package practice_CRUD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_Collections_CRUD {
    public static void main(String[] args) {
        // Create

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("사과");
        System.out.println(fruits);

        fruits.add("바나나");
        System.out.println(fruits);

        fruits.addAll(Arrays.asList("포도", "복숭아"));
        System.out.println(fruits);

        fruits.add(1, "파인애플");
        System.out.println(fruits);

        // Read

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));

        List<String> part = fruits.subList(0, 3);
        System.out.println(part);

        for (int i = 0; i < Math.min(3, fruits.size()); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println(String.join("", fruits)); // delimiter(구분자)


        // Update

        fruits.set(1, "수박"); // 1번 인덱스의 "파인애플" -> "수박"
        System.out.println(fruits);

        // Delete

        System.out.println(fruits.size());
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
