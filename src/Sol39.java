
import java.io.FileInputStream;

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String numberStr = Integer.toString(i);
            int clapCount = 0;

            for (char c : numberStr.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    clapCount++;
                }
            }

            if (clapCount == 0) {
                System.out.print(i);
            } else {
                for (int j = 0; j < clapCount; j++) {
                    System.out.print("-");
                }
            }
            System.out.print(" ");
        }
    }
}
