package programmers.level0.lengthofarrayelement;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String str:strlist){
            answer[i++] = str.length();
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(sol.solution(strlist)));
    }
}
