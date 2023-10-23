import java.util.*;
class Dog {
    public int solution(int[][] board){
        int[] answer = new int[2];
        int dogLocation[] = new int[2];
        int humanLocation[] = new int[2];

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                if(board[i][j]==2) {
                    humanLocation[0] = i;
                    humanLocation[1] = j;
                } else if (board[i][j]==3) {
                    dogLocation[0] = i;
                    dogLocation[1]=j;
                }


        if(findDog(dogLocation, humanLocation))
            return 0;

        int n = 10;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d1 = 0,d2=0, count = 0;

        while( !findDog(dogLocation,humanLocation) || count>=10000 ){

            int nx1 = dogLocation[0] + dx[d1], ny1 = dogLocation[1] + dy[d1], nx2 = humanLocation[0] + dx[d2], ny2 = humanLocation[1] + dy[d2];

            if(nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= n || board[nx1][ny1] == 1)
                d1 = (d1 + 1) % 4;
            else {
                dogLocation[0] = nx1;
                dogLocation[1] = ny1;
            }

            if(nx2 < 0 || nx2 >= n || ny2 < 0 || ny2 >= n || board[nx2][ny2] == 1)
                d2 = (d2 + 1) % 4;
            else {
                humanLocation[0] = nx2;
                humanLocation[1] = ny2;
            }
            count++;

        }
        return (count == 10000)?0:count;
    }

    private static boolean findDog(int[] dogLocation, int[] humanLocation) {
        return dogLocation[0] == humanLocation[0] && dogLocation[1] == humanLocation[1];
    }

    public static void main(String[] args){
        Dog T = new Dog();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}