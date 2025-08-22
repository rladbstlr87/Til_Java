package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        // 주차 요금은 시간당 4,000원 (일일 최대 요금은 30,000원)
        // 경차 혹은 장애인 차량은 최종 요금에서 50% 할인

        int hour = 20;
        boolean isSmallCar = true; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
