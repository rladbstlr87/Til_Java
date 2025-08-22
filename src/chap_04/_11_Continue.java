package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 치킨 나왔습니다.");

            // 치킨을 가져가는 상황에서 노쇼 발생
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 드리겠습니다");
                continue; // 아랫줄 실행하지 않음
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("---------------");

        // While
        sold = 0;
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다");
            // 손님이 없다면
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 드리겠습니다");
                index++; // While의 경우 index가 continue의 아랫줄이라서 실행되지 않아서 추가해야 함
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다");
    }
}
