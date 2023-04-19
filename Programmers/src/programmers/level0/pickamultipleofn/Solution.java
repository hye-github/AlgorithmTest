package programmers.level0.pickamultipleofn;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};
        System.out.println(Arrays.toString(sol.solution(n,numlist)));
    }
}
