package programmers.level0.sharingpizza1;

public class Solution {
    public int solution(int n) {
        return n%7==0 ? n/7 : n/7 + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1;
        System.out.println(sol.solution(n));
    }
}
