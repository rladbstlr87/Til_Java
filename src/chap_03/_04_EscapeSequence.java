package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //  특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전     9,000원
        // 김치전      8,000원
        // 부추전      8,000원
        System.out.println("해물파전\t9,000원");
        System.out.println("김치전\t8,000원");
        System.out.println("부추전\t8,000원");
        System.out.println();

        // \\ : 역슬래시 1개
        System.out.println("C:\\Program Files\\Java");
        System.out.println();

        // \" : 따옴표
        // 단비야 "애옹" 이라고 했어요
        System.out.println("단비가 \"애옹\" 이라고 했어요");
        System.out.println();

        // \' : 작은 따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
