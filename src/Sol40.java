
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.util.*;

class Sol40
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=10;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> numList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int listMax= Collections.max(numList);

            int[][] temp = new int[listMax][n];
            int result =0;
            for(int i=0;i<n;i++) {
                int indexEnd = numList.get(i);

                for(int j=0;j<indexEnd;j++) {
                    temp[j][i]=1;
                }
            }

            for(int i=0;i<listMax;i++)
                for(int j=2;j<n-2;j++)
                    if(temp[i][j]==1)
                        if(temp[i][j-2]==0&&temp[i][j-1]==0&&temp[i][j+1]==0&&temp[i][j+2]==0)
                            result++;

            System.out.println("#"+test_case+" "+result);

//			Arrays.stream(temp).forEach(n2->{
//				Arrays.stream(n2).forEach(n3->{
//					System.out.print(n3+" ");
//				});
//				System.out.println();
//			});



        }
    }
}