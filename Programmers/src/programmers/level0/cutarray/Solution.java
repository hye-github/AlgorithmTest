package programmers.level0.cutarray;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for (int i = 0; i < answer.length ; i++){
            answer[i] = numbers[num1++];
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(sol.solution(numbers,num1,num2)));
    }
}
