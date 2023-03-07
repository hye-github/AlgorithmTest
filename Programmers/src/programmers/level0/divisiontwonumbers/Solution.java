package programmers.level0.divisiontwonumbers;

public class Solution {
    public int solution(int num1, int num2){
        return (int) (((double) num1 / num2) * 1000);
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 16;
        Solution sol = new Solution();
        System.out.println(sol.solution(num1,num2));
    }
}
