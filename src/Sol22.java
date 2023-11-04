import java.util.*;
import java.util.stream.Collectors;

public class Sol22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            int min =100000;
            int humans = Integer.parseInt(sc.nextLine());
            List<Integer> humansRecordList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .map(n->(n>=0)?n:n*-1)
                    .collect(Collectors.toList());
            Map<Integer,Integer> humansRecordSumMap = new HashMap<>();
            for (int j = 0; j < humans; j++) {
                int key = humansRecordList.get(j);
                if(!humansRecordSumMap.containsKey(key))
                    humansRecordSumMap.put(key,1);
                else
                    humansRecordSumMap.put(key,humansRecordSumMap.get(key)+1);
                if(min>key)
                    min=key;
            }
            System.out.println("#"+(i+1)+" "+min+" "+humansRecordSumMap.get(min));
        }
    }
}
