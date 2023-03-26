package programmers.level0.reversestring;

public class Solution {
    public String solution(String my_string) {
        String[] ms = my_string.split("");
        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < ms.length; i++){
            answer.append(ms[ms.length-1-i]);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "jaron";
        System.out.println(sol.solution(my_string));
    }
}
