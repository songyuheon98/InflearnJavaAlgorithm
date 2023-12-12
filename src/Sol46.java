import java.util.ArrayList;

import java.util.*;
class Sol46 {
    static int[] input;
    static int[] check;
    static int[] combi;
    static int num=0,m=0,ch=0,result=-1;
    public void DFS(int L){
        if(ch==0) {
            String temp = "";
            if (L == m) {
                for (int x : combi) temp += x;
                int tempIsBig = Integer.parseInt(temp);
                if (tempIsBig > num) {
                    result=tempIsBig;
                    ch=1;
                }
            } else {
                for (int i = 0; i < combi.length; i++) {
                    if(check[i]!=1) {
                        combi[L] = input[i];
                        check[i] = 1;
                        DFS(L + 1);
                        check[i] = 0;
                    }
                }
            }
        }
    }
    public int solution(int n){
        int L=0,s=0;
        num=n;ch=0;result=-1;
        input = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        // 9 , 3 ,3
        m= input.length;   combi=new int[input.length];   check=new int[input.length];
        DFS(L);
        return result;
    }

    public static void main(String[] args){
        Sol46 T = new Sol46();
        System.out.println(T.solution(123));
        System.out.println(T.solution(321));
        System.out.println(T.solution(20573));
        System.out.println(T.solution(27711));
        System.out.println(T.solution(54312));
    }
}




//}
//class Sol46 {
//    int answer, target, m;
//    ArrayList<Integer> nums;
//    int[] ch;
//    boolean flag;
//
//    public void DFS(int L, int number) {
//        if (flag) return;
//        if (L == m) {
//            if (number > target) {
//                answer = number;
//                flag = true;
//            }
//        } else {
//            for (int i = 0; i < m; i++) {
//                if (ch[i] == 0) {
//                    ch[i] = 1;
//                    DFS(L + 1, number * 10 + nums.get(i));
//                    ch[i] = 0;
//                }
//            }
//        }
//    }
//
//    public int solution(int n) {
//        answer = 0;
//        flag = false;
//        nums = new ArrayList<>();
//        target = n;
//        int tmp = n;
//        while (tmp > 0) {
//            int t = tmp % 10;
//            nums.add(t);
//            tmp = tmp / 10;
//        }
//        nums.sort((a, b) -> a - b);
//        m = nums.size();
//        ch = new int[m];
//        DFS(0, 0);
//        if (flag == false) return -1;
//        return answer;
//    }
//}
