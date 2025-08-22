package chap_05;

public class _03_MultiDimensionalArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)
        // 영화관 좌석

        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // B2, C5에 접근하려면 (세로, 가로)
        System.out.println(seats[1][1]);
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // A3 에 접근
        System.out.println(seats2[0][2]);

        // 3차원 배열 (세로, 가로, 높이)
//        String[][][] marray = new String[][][] {
//                { {}, {}, {} },
//                { {}, {}, {} },
//                { {}, {}, {} },
//        };
    }
}
