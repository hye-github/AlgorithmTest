package programmers.level0.createmax2;

import java.util.Arrays;
public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        if(numbers[0]*numbers[1] > numbers[numbers.length-2]*numbers[numbers.length-1]){
            answer = numbers[0]*numbers[1];
        } else {
            answer = numbers[numbers.length-2]*numbers[numbers.length-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        System.out.println(sol.solution(numbers));
    }
}