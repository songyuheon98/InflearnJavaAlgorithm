import java.util.*;
class Solution {
    public int[] solution(int[][] board, int k){
        int direction = 0;
        int []answer = new int[2];
        int n=board.length;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < k; i++) {
            if(direction==0){
                if(answer[1]==n-1) {
                    direction=1;
                    continue;
                } else if (board[answer[0]][answer[1]+1]==1) {
                    direction=1;
                    continue;
                } else
                    answer[1]+=1;
            } else if (direction==1) {
                if( answer[0]==n-1 ) {
                    direction=2;
                    continue;
                } else if (board[answer[0]+1][answer[1]]==1) {
                    direction=2;
                    continue;
                } else
                    answer[0]+=1;
            } else if (direction==2) {
                if(answer[1]==0) {
                    direction=3;
                    continue;
                } else if (board[answer[0]][answer[1]-1]==1) {
                    direction=3;
                    continue;
                } else
                    answer[1]-=1;
            } else if (direction==3) {
                if( answer[0]==0) {
                    direction=0;
                    continue;
                } else if (board[answer[0]-1][answer[1]]==1) {
                    direction=0;
                    continue;
                } else
                    answer[0]-=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }
}