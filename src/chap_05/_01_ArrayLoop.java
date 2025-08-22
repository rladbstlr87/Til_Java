package chap_05;

public class _01_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 길이를 이용한 순회
        String[] coffees = {"americano", "mocha", "latte", "cappuccino"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------");

        // enhanced for (for-each) 반복
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
