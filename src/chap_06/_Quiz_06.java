package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래 위치부터 비공개 적용

        String name = "김윤식";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
