package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 자몽 에이드 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1
        boolean hallabongAde = false;
        boolean mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else { // 아무 조건도 만족하지 않는데 else 구문 생략되었으면 아무일도 안일어남
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}
