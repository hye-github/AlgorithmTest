package programmers.level0.numberofduplicatedigits;

public class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i:array){
            if(i==n){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(sol.solution(array,n));
    }
}
