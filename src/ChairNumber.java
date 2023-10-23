import java.util.*;

class ChairNumber {
    public int[] solution(int c, int r, int k) {
        int[] answer = new int[2];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int maxX = c-1, maxY = r-1, minX = 0, minY = 0, d = 0;

        for (int i = 0; i < c*r; i++) {
            if(i==k-1) {
                answer[0]++;
                answer[1]++;
                return answer;
            }
            if (d == 0 ) {
                if (answer[1] == maxY) {
                    minX++;
                    d = 1;
                }
            }
            else if (d == 1) {
                if (answer[0] == maxX) {
                    maxY--;
                    d = 2;
                }
            }
            else if (d == 2 ) {
                if (answer[1] == minY) {
                    maxX--;
                    d = 3;
                }
            }
            else if (d == 3 ) {
                if (answer[0] == minX) {
                    minY++;
                    d = 0;
                }
            }
            answer[0] += dx[d];
            answer[1] += dy[d];


        }
        return new int[2];
    }

    public static void main(String[] args) {
        ChairNumber T = new ChairNumber();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}

