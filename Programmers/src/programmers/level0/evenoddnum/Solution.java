package programmers.level0.evenoddnum;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int num:num_list){
            if(num%2==0){
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}
