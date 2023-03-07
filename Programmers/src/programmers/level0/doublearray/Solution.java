package programmers.level0.doublearray;

import java.util.Arrays;
public class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}
