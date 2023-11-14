import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.util.*;

class Sol37
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            List<Integer> numList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());

            int sumResult =0;

            for(int i = 1 ; i<9;i++)
            {
                sumResult += numList.get(i);
            }
            double result =sumResult/8.0;
            System.out.println("#"+test_case+" "+Math.round(result));

        }
    }
}