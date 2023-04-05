package programmers.level0.vowelremoval;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i++){
            if(my_string.charAt(i) != 'a'
                    && my_string.charAt(i) != 'e'
                    && my_string.charAt(i) != 'i'
                    && my_string.charAt(i) != 'o'
                    && my_string.charAt(i) != 'u'
            ){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "nice to meet you";
        System.out.println(sol.solution(my_string));
    }
}
