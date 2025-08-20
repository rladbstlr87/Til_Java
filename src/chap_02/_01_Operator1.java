package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 2.5이지만 소수점 버리고 2가 몫
        System.out.println(2 / 4); // 0.5이지만 소수점 버리고 0
        System.out.println(4 % 2); // 몫은 2이고 나머지를 표기하므로 0
        System.out.println(5 % 2); // 몫은 2이고 나머지를 표기하므로 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
//        val++; val을 먼저 연산하고 그다음에 1을 더함. val = val + 1
//        ++val; val에 1을 더하는 연산을 먼저 하고 val을 연산

        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 3

    }
}
