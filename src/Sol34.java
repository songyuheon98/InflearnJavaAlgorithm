import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Sol34 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            int status = 1;

            for (int i = 0; i < 9; i++) {
                Map<Integer, Integer> initMap = new HashMap<>();
                for (int k = 1; k <= 9; k++) {
                    initMap.put(k, 0); // 1부터 9까지 초기화
                }

                int[] intOneLine = Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                for (int num : intOneLine) {
                    if (initMap.get(num) == 1) {
                        status = 0;
                        break; // 중복 발견 시 내부 루프 탈출
                    }
                    initMap.put(num, 1);
                }

                if (status == 0) break; // 중복 발견 시 바깥쪽 루프도 탈출
            }
            System.out.println("#"+test_case+" "+status);
        }
    }
}
