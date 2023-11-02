import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sol12 {

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T;
        T=sc.nextLine();
        char[] temp =T.toCharArray();
        for (char a:temp) {
            System.out.print(a-'A'+1+" ");
        }
    }
}