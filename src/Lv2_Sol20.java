import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;
// double b = 1.0;
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
        import java.io.FileInputStream;
import java.util.stream.Collectors;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Lv2_Sol20
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
            int []maxIndex ={0};
            int[] maxCount={0};
            List<Integer> intList= Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            Map<Integer,Integer> intMapList = new HashMap<Integer,Integer>();

            for (int i = 0; i < intList.size(); i++) {
                int index =intList.get(i);
                if(intMapList.containsKey(index))
                    intMapList.put(index,intMapList.get(index)+1);
                else
                    intMapList.put(index,1);
            }
            intMapList.forEach((n1,n2)->
            {
                if(maxCount[0]<n2){
                    maxIndex[0]=n1;
                    maxCount[0]=n2;
                }
                else if(maxCount[0]==n2){
                    if(maxIndex[0]<n1)
                    {
                        maxIndex[0]=n1;
                        maxCount[0]=n2;
                    }
                }
            });
            System.out.println("#"+test_case+" "+maxIndex[0]);
        }
    }
}