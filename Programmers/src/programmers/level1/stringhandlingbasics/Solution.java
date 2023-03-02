package programmers.level1.stringhandlingbasics;

import java.util.regex.Pattern;

public class Solution {
    public boolean solution(String s) {
        boolean numCheck = Pattern.matches("^[0-9]*$", s);
        if (numCheck) {
            if (s.length() == 4 || s.length() == 6) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "10a0";
        System.out.println(sol.solution(s));
    }
}
