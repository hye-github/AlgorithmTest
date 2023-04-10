package programmers.level0.squarenumberdiscrimination;

public class Solution {
    public int solution(int n) {
        if(n == 1){return 1;}
        for(int i = 2; i < n/2; i++){
            if(i*i==n){
                return 1;
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        System.out.println(sol.solution(n));
    }
}
