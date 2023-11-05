
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;

class Sol31 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(sc.nextLine());
            int[][] numList = new int[n][n];
            int[][] numRotationList = new int[n][n];
            String[] result=new String[n];
            Arrays.fill(result,"");

            for (int i = 0; i < n; i++) {
                numList[i] = Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .mapToInt(Integer::intValue)
                        .toArray();
            }
            for (int k = 0; k < 3; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        numRotationList[i][j] = numList[n - 1 - j][i];
                        result[i] += numRotationList[i][j];
                    }
                    result[i] += " ";
                }
                for (int i = 0; i < n; i++)
                    numList[i]=Arrays.copyOf(numRotationList[i], numRotationList[i].length);

            }
            System.out.println("#"+test_case);
            for (int i = 0; i < n; i++) {
                System.out.println(result[i]);
            }
        }
    }
}