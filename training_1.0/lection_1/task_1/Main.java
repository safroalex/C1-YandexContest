package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tRoom = scanner.nextInt();
            int tCond = scanner.nextInt();

            scanner.nextLine();

            String regime = scanner.nextLine();

            int output = regime.equals("fan") ? tRoom :
                         regime.equals("freeze") ? (tCond > tRoom ? tRoom : tCond) :
                         regime.equals("heat") ? (tCond < tRoom ? tRoom : tCond) :
                         tCond;
                         
            System.out.println(output);
        }
    }
}