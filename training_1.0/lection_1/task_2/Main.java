package task_2;

import java.util.Scanner;

public class Main {

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        String result = (a < b + c && b < a + c && c < a + b) ? YES : NO;
        System.out.println(result);
    }
}
