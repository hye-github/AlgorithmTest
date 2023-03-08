package programmers.level0.findmedian;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array){
        Arrays.sort(array);
        return array[array.length/2];
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] array = {9,-1,0};
        System.out.println(sol.solution(array));
    }
}
