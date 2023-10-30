import java.util.*;
class Bitonic {
    public int solution(int[] nums){
        int answer = 0;
        int cur_num = 0,next_num = 0,count = 1,d=0,pre_d=0,pre_count=0,loop=0;

        for (int i = 0; i < nums.length-1; i++) {
            cur_num = nums[i];
            next_num = nums[i+1];

            pre_d = d;
            if(cur_num<next_num) {
                d=1;
            } else if (cur_num>next_num) {
                d=-1;
            } else {
                d=0;
            }

            if(pre_d == 0 )
                pre_d = d;

            if(pre_d==d) {
                if(!(d==0&&pre_d==0))
                    count++;
            }
            else{
                if(d==0||d==1){
                    if(loop==1)
                        if(pre_count<count)
                            pre_count=count;
                    pre_d=1;
                    d=1;
                    count=2;
                    loop=0;

                } else if (d==-1) {
                    loop++;
                    count++;
                }
            }
            if(i==nums.length-2)
                if(pre_count<count)
                    pre_count=count;
        }

        return pre_count;
    }

    public static void main(String[] args){
        Bitonic T = new Bitonic();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}