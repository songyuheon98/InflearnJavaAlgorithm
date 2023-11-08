
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;


class Sol36
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            List<Integer> intList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int check =intList.get(1);
            int n = intList.get(0);
            int result =0;

            for (int i = 0; i < n; i++) {
                List<Integer> tempIntList = Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                for (int j = 0; j < tempIntList.size(); j++)
                    check-= tempIntList.get(j);

                if(check==0)
                    result++;
            }
            System.out.println("#"+test_case+" "+result);
        }
    }
}