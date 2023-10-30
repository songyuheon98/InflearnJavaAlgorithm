import java.lang.reflect.Array;
import java.util.*;
class BitonicSol {
    public int solution(int[] nums){
        int answer = 0,pre=0,cur=0,next=0,count=0;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1]<nums[i]&&nums[i]>nums[i+1])
                temp.add(i);
        }
        temp.forEach(System.out::println);

        return answer;
    }

    public static void main(String[] args){
        BitonicSol T = new BitonicSol();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}