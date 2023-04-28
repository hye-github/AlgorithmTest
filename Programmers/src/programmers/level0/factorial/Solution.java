package programmers.level0.factorial;

public class Solution {
    public int solution(int n) {
        int sum = 1;
        int count = 0;
        for(int i = 1; i < 11; i++){
            sum *= i;
            if(n < sum){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;
        System.out.println(sol.solution(n));
    }
}