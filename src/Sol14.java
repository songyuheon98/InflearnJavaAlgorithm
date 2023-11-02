
import java.util.Scanner;
import java.io.FileInputStream;


class Sol14 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T, result = 0;
        T = sc.nextInt();


        do {
            result += T % 10;
            T = T / 10;
        }
        while (T % 10 != 0);

        System.out.print(result);
    }
}