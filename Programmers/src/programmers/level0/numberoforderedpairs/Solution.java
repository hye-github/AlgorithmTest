package programmers.level0.numberoforderedpairs;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 20;
        System.out.println(sol.solution(n));
    }
}
