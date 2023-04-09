package programmers.level0.antcolony;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count = 0;
        int ant1 = 5;
        int ant2 = 3;
        int ant3 = 1;

        if(hp==1) {
            return 1;
        } else if(hp==2){
            return 2;
        } else if(hp==3){
            return 1;
        } else if(hp==4){
            return 2;
        } else if(hp==5){
            return 1;
        } else if(hp%ant1 == 0){
            return hp/ant1;
        } else {
            count = hp / ant1;
            answer = hp % ant1;
            if (answer % ant2 == 0) {
                return count + answer / ant2;
            } else if(hp % ant1 < ant2){
                return count + answer / ant3;
            } else {
                return count + answer / ant2 + (answer%ant2) / ant3;
            }
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int hp = 6;
        System.out.println(sol.solution(hp));
    }
}
