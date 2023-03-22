package programmers.level0.fliparray;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i = 0;
        for(int num:num_list){
            answer[num_list.length-1-i++] = num;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}
