package programmers.level0.completingtriangle1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2]<sides[0]+sides[1] ? 1:2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {199, 72, 222};
        System.out.println(sol.solution(sides));
    }
}
