package programmers.level0.sortingstrings1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for(char ch : my_string.toCharArray()){
            if(48 <= ch && ch <= 57){
                // list.add(ch-'0');
                list.add(Character.getNumericValue(ch));
            }
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for(int i : list){
            answer[size++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "p2o4i8gj2";
        System.out.println(Arrays.toString(sol.solution(my_string)));
    }
}
