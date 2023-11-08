
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;


class Sol35
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
                    .collect(Collectors.toList());

            int addTime = numList.get(0)*60 + numList.get(1)+numList.get(2)*60 + numList.get(3);
            addTime%=12*60;
            int addTimeHour = addTime/60;
            int addTimeMin = addTime%60;
            System.out.println("#"+test_case+" "+addTimeHour+" "+addTimeMin);
        }
    }
}