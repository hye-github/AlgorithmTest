package programmers.level0.iceamericano;

import java.util.Arrays;

public class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 15000;
        System.out.println(Arrays.toString(sol.solution(money)));
    }
}
