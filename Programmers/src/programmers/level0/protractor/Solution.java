package programmers.level0.protractor;

public class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle<90){
            return 1;
        } else if(angle==90){
            return 2;
        } else if(angle<180){
            return 3;
        } else if(angle==180){
            return 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int angle = 70;
        System.out.println(sol.solution(angle));
    }
}
