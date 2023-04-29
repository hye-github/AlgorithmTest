package programmers.level0.numberofk;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i <= j; i++){
            String[] iStr = String.valueOf(i).split("");
            for(int c = 0; c < iStr.length; c++){
                if(iStr[c].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(sol.solution(i,j,k));
    }
}
