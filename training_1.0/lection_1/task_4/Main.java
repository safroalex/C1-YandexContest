package task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        solveEquation(a, b, c);
    }

    private static void solveEquation(int a, int b, int c) {
        if (a == 0) {
            if (b == c * c) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else {
            int x = (c * c - b) / a;
            if (c < 0 || (c * c - b) % a != 0) {
                System.out.println("NO SOLUTION");
            } else {
                System.out.println(x);
            }
        }
    }
}
