package programmers.level0.findthelocationofapoint;

public class Solution {
    public int solution(int[] dot) {
        if(dot[0]>0 && dot[1]>0 ) {
            return 1;
        } else if(dot[0]<0 && dot[1]>0 ) {
            return 2;
        } else if(dot[0]<0 && dot[1]<0 ) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dot = {-7,9};
        System.out.println(sol.solution(dot));
    }
}
