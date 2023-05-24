package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newNumber = scanner.nextLine().replaceAll("[^0-9]", "");
        String[] phoneBook = new String[3];
        for (int i = 0; i < 3; i++) {
            phoneBook[i] = scanner.nextLine().replaceAll("[^0-9]", "");
            if (phoneBook[i].length() == 7) {
                phoneBook[i] = "495" + phoneBook[i];
            } else if (phoneBook[i].charAt(0) == '8') {
                phoneBook[i] = "7" + phoneBook[i].substring(1);
            } else if (phoneBook[i].charAt(0) == '7') {
                phoneBook[i] = phoneBook[i].replaceFirst("7", "8");
            }
        }
        for (String number : phoneBook) {
            if (number.equals(newNumber)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        for (int i = 0; i < phoneBook.length; i++) {
            System.out.println(phoneBook[i]);
        }
    }
}

