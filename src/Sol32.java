
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;

class Sol32
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> numList= Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());
            System.out.print("#"+test_case+" ");
            numList.forEach(n2-> System.out.print(n2.intValue()+" "));
            System.out.println();
        }
    }
}