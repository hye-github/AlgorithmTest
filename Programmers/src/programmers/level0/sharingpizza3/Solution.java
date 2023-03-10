package programmers.level0.sharingpizza3;

public class Solution {
    public int solution(int slice, int n) {
        return n%slice==0 ? n/slice : n/slice + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 4;
        int n = 12;
        System.out.println(sol.solution(slice, n));
    }
}
