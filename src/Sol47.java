import java.util.Arrays;

public class Sol47 {
    public int solution(int n) {
        char[] numbers = Integer.toString(n).toCharArray();
        int i = numbers.length - 2;

        // 오른쪽에서 왼쪽으로 이동하며 감소하는 순서가 깨지는 지점 찾기
        while (i >= 0 && numbers[i] >= numbers[i + 1]) {
            i--;
        }

        if (i == -1) {
            return -1; // 다음 순열이 없음
        }

        // 오른쪽에서 왼쪽으로 이동하며 i보다 큰 첫 번째 숫자 찾기
        int j = numbers.length - 1;
        while (numbers[j] <= numbers[i]) {
            j--;
        }

        // 숫자 교환
        swap(numbers, i, j);

        // i 이후 숫자들을 오름차순 정렬
        Arrays.sort(numbers, i + 1, numbers.length);

        // 결과를 int로 변환하여 반환
        return Integer.parseInt(new String(numbers));
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Sol46 solution = new Sol46();
        System.out.println(solution.solution(123));
        System.out.println(solution.solution(321));
        System.out.println(solution.solution(20573));
        System.out.println(solution.solution(27711));
        System.out.println(solution.solution(54312));
    }
}