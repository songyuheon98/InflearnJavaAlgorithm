
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;

class Sol34
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int status = 1;
            List<List<Integer>> num=new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                num.add(Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));
            }
           num.forEach(System.out::println);

            // 가로줄 및 세로줄 체크
            for (int i = 0; i < 9; i++) {
                int[] tempR = new int[9];
                int[] tempC = new int[9];
                int[] temp33 = new int[9];
                for (int j = 0; j < 9; j++) {

                    int rowIndex = 3 * (i / 3);
                    int colIndex = 3 * (i % 3);


                    int indexR = num.get(i).get(j);
                    int indexC = num.get(j).get(i);
                    int index33 = num.get(rowIndex+j/3).get(colIndex+j%3);
                                            // 0 j=0        3
                    if(tempR[indexR-1]==1||tempC[indexC-1]==1||temp33[index33-1]==1)
                        status=0;
                    if(status==0)
                        break;
                    tempR[indexR -1]+=1;
                    tempC[indexC-1]+=1;
                    temp33[index33-1]+=1;
                }
                if(status==0)
                    break;
            }
            System.out.println("#"+test_case+" "+status);
        }
    }
}