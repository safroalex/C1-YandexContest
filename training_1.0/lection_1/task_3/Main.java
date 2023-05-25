package task_3;

import java.util.Scanner;

public class Main {

    private static final String CODE_NUMBER = "7";
    private static final String CODE_AND_REGION = "7495";
    private static final int PHONE_BOOK_SIZE = 3;

    public static String formatNumber(String input) {
        if (input.length() == 11 && input.charAt(0) == '8') {
            input = "7" + input.substring(1);
        } else if (input.length() == 10) {
            input = CODE_NUMBER + input;
        } else if (input.length() == 7) {
            input = CODE_AND_REGION + input;
        }
        return input;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String newNumber = formatNumber(scanner.nextLine().replaceAll("[^0-9]", ""));
            String[] phoneBook = new String[PHONE_BOOK_SIZE];

            for (int i = 0; i < phoneBook.length; i++) {
                phoneBook[i] = formatNumber(scanner.nextLine().replaceAll("[^0-9]", ""));
            }

            for (String phone : phoneBook) {
                System.out.println(newNumber.equals(phone) ? "YES" : "NO");
            }
        }
    }
}
