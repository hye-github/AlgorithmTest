package programmers.level0.numberofwaystodividemarbles;

public class Solution {
    public int solution(int balls, int share) {
        double ballsFac = 1;
        double shareFac = 1;
        double nmFac = 1;

        for(int i = 1; i <= balls; i++){
            ballsFac *= i;
        }
        for(int i = 1; i <= share; i++){
            shareFac *= i;
        }
        if((balls-share)!=0){
            for(int i = 1; i <= (balls-share); i++){
                nmFac *= i;
            }
        } else {
            return 1;
        }
        return (int) Math.round(ballsFac/(nmFac*shareFac));
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int balls = 30;
        int share = 29;
        System.out.println(sol.solution(balls,share));
    }
}
