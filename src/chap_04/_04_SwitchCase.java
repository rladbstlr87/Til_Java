package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

//        석차에 따른 장학금 지급
//        1등 : 전액 장학금
//        2등 : 반액 장학금
//        3등 : 반액 장학금
//        그 외 : 장학금 대상 아님

        // If Else 문을 이용
        int ranking = 4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
//        switch ( expression ) {
//            case A: ... 수행할 명령 ...
//                break;
//            case B: ... 수행할 명령 ...
//                break;
//            case C: ... 수행할 명령 ...
//                break;
//            default: ... 수행할 명령 ...
//        }
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
                System.out.println("등급이 높아서 1000원 추가됨");
            case 2:
                price += 1000;
                System.out.println("등급이 높아서 1000원 추가됨");
            case 3:
                price += 1000;
                System.out.println("등급이 높아서 1000원 추가됨");
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : 총 " + price + "원");
    }
}
