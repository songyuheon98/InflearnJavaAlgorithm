
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Sol25 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int caseLoop = Integer.parseInt(sc.nextLine());
            int currentSpeed = 0, moveDistance = 0;
            for (int i = 0; i < caseLoop; i++) {
                String swAndRange[] = sc.nextLine().split(" ");

                if (swAndRange[0].equals("1"))
                    currentSpeed += Integer.parseInt(swAndRange[1]);
                else if (swAndRange[0].equals("2"))
                    currentSpeed -= Integer.parseInt(swAndRange[1]);
                if(currentSpeed<0)
                    currentSpeed=0;
                moveDistance += currentSpeed;
            }
            System.out.println("#"+test_case+" "+moveDistance);
        }
    }
}