package programmers.level0.twonumbersofdifference;

public class Solution {
    public int solution (int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int num1 = 100;
        int num2 = 2;
        System.out.println(sol.solution(num1,num2));
    }
}
