package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착");
        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청 큰 사람
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착");
        System.out.println(move);
        System.out.println(" --- 반복문 #2 ---");

        // Do While 반복문
        // do 구문을 먼저 한 번은 실행하고 그다음에 while 조건에 따라 do가 여러번 실행
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착");
        System.out.println(move);
        System.out.println(" --- 반복문 #2 ---");
    }
}
