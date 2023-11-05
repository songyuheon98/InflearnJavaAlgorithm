
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;


class Sol30
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            sc.nextLine();
            int result =0;
            List<Integer> firstIntList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int firstIntListLength = firstIntList.size();

            List<Integer> secondIntList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int secondIntListLength = secondIntList.size();

            int repeatNum = (firstIntListLength-secondIntListLength>0)?firstIntListLength-secondIntListLength+1
                    :(firstIntListLength-secondIntListLength)*-1+1;

            for (int i = 0; i < repeatNum; i++) {
                int temp = 0;
                List<Integer> maxList = (firstIntListLength> secondIntListLength)?firstIntList:secondIntList;
                List<Integer> minList = (firstIntListLength< secondIntListLength)?firstIntList:secondIntList;

                for (int j = 0; j <minList.size() ; j++) {
                    temp += maxList.get(i+j)*minList.get(j);
                }
                if(result<temp)
                    result = temp;
            }
            System.out.println("#"+test_case+" "+result);

        }
    }
}