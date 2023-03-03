package programmers.level1.budget;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            answer++;
            if (sum > budget) {
                answer--;
                break;
            }
        }
        if (sum < budget) {
            answer = d.length;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(sol.solution(d, budget));
    }
}
