package programmers.level0.findingaliquot;

import java.util.*;

public class Solution {
    public Integer[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i ++){
            if( n % i == 0 ){
                list.add(i);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 29;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}
