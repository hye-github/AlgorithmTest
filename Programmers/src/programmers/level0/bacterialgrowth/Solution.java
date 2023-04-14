package programmers.level0.bacterialgrowth;

public class Solution {
    public int solution(int n, int t) {
        for(int i = 0; i < t; i++){
            n = n * 2;
        }
        return n;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2;
        int t = 10;
        System.out.println(sol.solution(n,t));
    }
}
