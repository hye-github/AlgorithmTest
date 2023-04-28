package programmers.level0.findingnum;

public class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] arr = Integer.toString(num).split("");
        for (String s : arr) {
            answer++;
            if (s.equals(Integer.toString(k))) {
                return answer;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 29183;
        int k = 1;
        System.out.println(sol.solution(n,k));
    }
}
