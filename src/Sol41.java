import java.util.*;

class Sol41 {
    public int solution(String s){
        int answer = -1;
        Map<Character,Integer> result = new HashMap<>();

        for(int i =0;i<s.length();i++) {
            char temp =s.charAt(i);
            if(result.containsKey(temp))
                result.put(temp, result.get(temp)+1);
            else
                result.put(temp, 1);
        }

        for(int i=0;i<s.length();i++) {
            if(result.get(s.charAt(i))==1) {
                answer=i+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Sol41 T = new Sol41();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}