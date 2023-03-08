package programmers.level0.findmode;

import java.util.HashMap;

public class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int count = 0;
        HashMap map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            map.put(array[i],count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(sol.solution(array));
    }
}
