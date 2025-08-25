package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    // 메소드 명 중복 가능. 여러 타입의 전달값을 모두 한 메소드 이름으로 퉁칠 수 있음
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나 할 때 사용가능
        System.out.println(getPower(3));
        System.out.println(getPower(4));
        System.out.println(getPower(3));
    }
}
