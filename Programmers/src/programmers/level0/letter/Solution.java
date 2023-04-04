package programmers.level0.letter;

import java.util.Arrays;

public class Solution {
    public int solution(String message) {
        return message.length()*2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = "happy birthday!";
        System.out.println(sol.solution(message));
    }
}
