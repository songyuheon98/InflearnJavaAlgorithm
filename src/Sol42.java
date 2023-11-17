
import java.util.*;
import java.util.stream.Collectors;
class Sol42 {
    public int solution(int[] nums){
        Set<Integer> setNum = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            setNum.add(nums[i]);


        List<Integer> listNum = new ArrayList<>();

        for(int a : setNum) {
            listNum.add(a);
        }
        listNum.sort((n1,n2)->n1-n2);
//		listNum.forEach(System.out::print);
        int maxCount =0,count=1;
        for(int i=0;i<listNum.size()-1;i++) {
            if(listNum.get(i)==listNum.get(i+1)-1) {
                count++;
            }
            else {
                if(maxCount<count)
                    maxCount=count;
                count=1;
            }
        }
        if(maxCount<count)
            maxCount=count;

//		listNum.forEach(System.out::print);
//		setNum.forEach(System.out::print);
//		System.out.println();
        return maxCount;
    }

    public static void main(String[] args){
        Sol42 T = new Sol42();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }
}