import java.util.Scanner;
        import java.util.stream.Collectors;
        import java.util.*;

class Sol45
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();



        for (int test_case = 1; test_case <= T; test_case++)
        {


            int n = Integer.parseInt(sc.nextLine().trim());

            List<Integer> numList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted((n1,n2)->n2.intValue()-n1.intValue())
                    .collect(Collectors.toList());

//			numList.forEach(System.out::print);
            int index=0;
            int max = numList.size()/2+1;
            int result =0;
            while(!numList.isEmpty()) {


                int first = numList.get(0);
                numList.remove(0);
                result+=first;

                if(numList.isEmpty())
                    break;

                int secound=first;

                for(int i=0;i<numList.size();i++) {
                    if(numList.get(i)!=secound) {
                        secound=numList.get(i);
                        numList.remove(i);
                        break;
                    }
                }
                if(first==secound) {
                    result += secound;
                    numList.remove(0);
                }

            }
            System.out.println("#" + test_case+" "+result);

        }

        sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
    }
}

////3
////4
////5 3 4 3
////4
////1 2 3 4
////4
////5 2 5 1



