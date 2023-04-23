package programmers.level0.findthelargestnumber;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int temp = 0;
        int count = 0;
        for(int num : array){
            if(num > temp){
                temp = num;
            }
        }
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == temp){
                count = i;
                break;
            }
        }
        int[] answer = {temp, count};
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(sol.solution(array)));
    }
}