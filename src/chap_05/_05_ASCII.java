package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // ASCII 코드 (ANSI) : 미국 표준 코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (String[] strings : seats3) { // 세로
            for (String string : strings) { // 가로
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
