package practice_CRUD;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _02_Scanner_CR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.in → 표준 입력 (키보드 입력)
        // System.out → 표준 출력 (콘솔 출력)
        ArrayList<String> todoList = new ArrayList<>();

        // Create - 사용자 입력 받기
        System.out.println("오늘의 할 일 : ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 할 일 : ");
            String task = sc.nextLine(); // nextLine() : 키보드 입력을 받다가 엔터(줄바꿈 문자 \n) 가 나올 때까지 입력을 읽음
            todoList.add(task);
        }

        // Read - 전체 목록 출력
        System.out.println("\n=== 전체 할 일 목록 ===");
        for (String task : todoList) {
            System.out.println("- " + task);
        }

        sc.close();

        todoList.add("돌잔치 가기");
        System.out.println(todoList);

        for (String task : todoList) {
            if (task.contains("씻기")) {
                System.out.println("기본적으로 해야할 일 : " + task);
            }
        }
    }
}
