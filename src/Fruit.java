import java.util.Arrays;
import java.util.Map;

import static java.util.Collections.min;

public class Fruit {
    // 배열 최솟값 리턴
    public int getMin(int[] fruit){
        int min = fruit[0];
        for (int i : fruit) {
            if(min>i)
                min=i;
        }
        return min;
    }
    // 배열의 최솟값 인덱스 리턴
    public int getMinIndex(int[] fruit){
        int min = getMin(fruit);
        for (int i = 0; i < fruit.length; i++)
            if(fruit[i]==min)
                return i;
        return 0;
    }
    // 배열의 최솟값이 중복인지 확인
    public Boolean minIsUnique(int [] fruit){
        int cnt =0,min = getMin(fruit);
        for (int i : fruit) {
            cnt++;
            if (i == min)
                break;
        }
        return cnt==1;
    }

    public int solution(int[][] fruit){
        int answer = 0,n=fruit.length;
        int checkNum[] = new int[n];

        for (int i = 0; i < n; i++) {
            if(checkNum[i]==1)
                continue;
            if(!minIsUnique(fruit[i]))
                continue;
            for (int j = 0; j < n; j++) {
                if(checkNum[j]==1)
                    continue;
                if(!minIsUnique(fruit[j]))
                    continue;
                int a = getMinIndex(fruit[i]);
                int b=getMinIndex(fruit[j]);

                if(a!=b && fruit[i][b]>0 && fruit[j][a]>0){
                    if(fruit[i][a] +1 <=fruit[i][b]-1 && fruit[j][b]+1<=fruit[j][a]-1){
                        fruit[i][a]++;
                        fruit[i][b]--;
                        fruit[j][b]++;
                        fruit[j][a]--;
                        checkNum[i]=1;
                        checkNum[j]=1;
                        break;
                    }
                }
            }
        }
        for (int[] arr : fruit) {
            answer += getMin(arr);
        }
        return answer;
    }

    public static void main(String[] args){
        Fruit T = new Fruit();
        System.out.println(T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
        System.out.println(T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));
        System.out.println(T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
        System.out.println(T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
    }
}
