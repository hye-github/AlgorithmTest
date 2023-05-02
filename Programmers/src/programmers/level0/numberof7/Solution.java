package programmers.level0.numberof7;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            String[] str = String.valueOf(i).split("");
            for(String s : str){
                if(s.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {7, 77, 17};
        System.out.println(sol.solution(array));
    }
}
