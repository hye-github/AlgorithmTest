package programmers.level0.completingtriangle2;

public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if(sides[0] > sides[1]) {
            answer += sides[1];
            answer += sides[0] + sides[1] - sides[0] - 1;
                   // sides[0] + sides[1] - sides[0] - 1;
        } else if (sides[0] < sides[1]) {
            answer += sides[0];
                  // sides[1] - (sides[1] - sides[0]);
            answer += sides[0] - 1;
        } else {
            answer += sides[0];
            answer += sides[0] - 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {1000, 1000};
        System.out.println(sol.solution(sides));
    }
}
