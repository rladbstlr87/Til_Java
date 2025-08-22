package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //  이중 반복문
        // '*' 로 5*5 사각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");

        // '*' 로 좌측 직각삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");

        // '*' 로 우측 직각삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(i);
                System.out.print(j);
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("k");
            }
            System.out.println();
        }
    }
}
