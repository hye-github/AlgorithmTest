package programmers.level0.comparenumbers;

public class Solution {
    public int solution(int num1, int num2) {
        return num1==num2 ? 1 : -1;
    }
    public static void main(String[] args) {
        int num1 = 111;
        int num2 = 11;
        Solution sol = new Solution();
        System.out.println(sol.solution(num1, num2));
    }
}
