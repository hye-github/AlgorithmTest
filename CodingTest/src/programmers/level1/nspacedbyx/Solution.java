package programmers.level1.nspacedbyx;

public class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long y = x;
        for(int i = 0; i<n ; i++){
            answer[i] = y;
            y += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2,5));
    }
}
