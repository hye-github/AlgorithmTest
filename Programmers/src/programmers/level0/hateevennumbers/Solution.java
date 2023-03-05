package programmers.level0.hateevennumbers;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        int[] answer = (n%2==0) ? new int[n/2] : new int[n/2+1];

        for(int i=0; i< answer.length; i++){
            answer[i] = i*2+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}
