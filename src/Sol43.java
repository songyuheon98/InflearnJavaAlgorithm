
import java.util.*;
class Sol43 {
    public int[] solution(int[] nums){
        int[] answer = new int[nums.length];
        List<List<Integer>> numLists = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            List<Integer> numList = new ArrayList<>();
            numList.add(nums[i]);
            int temp = nums[i];
            int count=0;
            while(temp!=0) {
                if(temp%2==1)
                    count++;
                temp/=2;
            }
            numList.add(count);
            numLists.add(numList);
        }

        answer = numLists.stream().sorted((f1,f2)->f1.get(0)-f2.get(0))
                .sorted((n2,n3)->n2.get(1)-n3.get(1))
                .map(n4->n4.get(0))
                .mapToInt(Integer::intValue)
                .toArray();


        return answer;
    }

    public static void main(String[] args){
        Sol43 T = new Sol43();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }
}