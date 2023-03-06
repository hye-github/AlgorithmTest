package programmers.level0.productoftwonumbers;

public class Solution {
    public int solution(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int num1 = 3;
        int num2 = 4;
        System.out.println(sol.solution(num1,num2));
    }
}