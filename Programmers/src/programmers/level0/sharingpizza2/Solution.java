package programmers.level0.sharingpizza2;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            answer++;
            if((6*answer)%n==0){ break;}
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        System.out.println(sol.solution(n));
    }
}
