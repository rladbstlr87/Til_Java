package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break

        // For
        int max = 20;
        for (int i = 1; i <= 50; i++) { // 줄선 손님이 50명이다라는 가정
            System.out.println(i + "번 손님, 주문하신 아메리카노 나왔습니다");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break; // break 적지않으면 반복문 탈출 못하고 재료소진 구문 출력 후 21번 손님 불러버림
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("------------------");

        // While
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
            index++;
        }
    }
}
