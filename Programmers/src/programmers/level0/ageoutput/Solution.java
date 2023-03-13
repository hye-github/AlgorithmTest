package programmers.level0.ageoutput;

public class Solution {
    public int solution(int age) {
        return 2023-age;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 40;
        System.out.println(sol.solution(age));
    }
}
