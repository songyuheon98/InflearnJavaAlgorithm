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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Sol33
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            Map<Integer,Integer> money = new LinkedHashMap<>();
            money.put(50000,0);
            money.put(10000,0);
            money.put(5000,0);
            money.put(1000,0);
            money.put(500,0);
            money.put(100,0);
            money.put(50,0);
            money.put(10,0);

            int num = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < money.size(); i++) {
                if(num>=50000){
                    money.replace(50000,num/50000);
                    num%=50000;
                }
                if(num>=10000){
                    money.replace(10000,num/10000);
                    num%=10000;
                }
                if(num>=5000){
                    money.replace(5000,num/5000);
                    num%=5000;
                }
                if(num>=1000){
                    money.replace(1000,num/1000);
                    num%=1000;
                }
                if(num>=500){
                    money.replace(500,num/500);
                    num%=500;
                }
                if(num>=100){
                    money.replace(100,num/100);
                    num%=100;
                }
                if(num>=50){
                    money.replace(50,num/50);
                    num%=50;
                }
                if(num>=10){
                    money.replace(10,num/10);
                    num%=10;
                }
            }
            System.out.println("#"+test_case);
            money.forEach((n1,n2)-> System.out.print(n2+" "));
            System.out.println();
        }
    }
}