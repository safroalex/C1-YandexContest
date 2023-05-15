// thats wrong

import java.util.Scanner;

public class decision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] groups = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            groups[i] = in.nextInt();
            sum += groups[i];
        }
        int k = in.nextInt();
        int[][] rooms = new int[k][2];
        for (int i = 0; i < k; i++) {
            rooms[i][0] = in.nextInt();
            rooms[i][1] = in.nextInt();
        }
        in.close();
        if (sum > 0) {
            for (int i = 0; i < k; i++) {
                if (rooms[i][0] >= sum) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}


