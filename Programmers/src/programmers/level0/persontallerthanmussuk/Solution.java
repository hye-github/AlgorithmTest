package programmers.level0.persontallerthanmussuk;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int tall:array){
            if(tall>height){answer++;}
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(sol.solution(array,height));
    }
}
