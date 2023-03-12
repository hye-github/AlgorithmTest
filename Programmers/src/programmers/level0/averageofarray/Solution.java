package programmers.level0.averageofarray;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }
        return answer / numbers.length;
    }

    public static void main(String[] args) {
       Solution sol = new Solution();
       int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(sol.solution(numbers));
    }
}
