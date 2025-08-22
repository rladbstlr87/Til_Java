package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "americano";
        String coffeeRachel = "mocha";
        String coffeeChandler = "latte";
        String coffeeMonica = "cappuccino";

        // 배열 선언 1번째 방법
//        String[] coffees = new String[4];

        // 배열 선언 2번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "americano";
//        coffees[1] = "mocha";
//        coffees[2] = "latte";
//        coffees[3] = "cappuccino";

        // 3번째 방법
//        String[] coffees = new String[]{"americano", "mocha", "latte", "cappuccino"};

        // 4번째 방법
        String[] coffees = {"americano", "mocha", "latte", "cappuccino"};
        System.out.println("------------");
        
        // 커피 주문
        coffees[2] = "espresso";
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        // 다른 자료형
        int[] i = new int[3];
        boolean[] b = {true, true, false};
    }
}
