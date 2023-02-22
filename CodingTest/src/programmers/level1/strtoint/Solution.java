package programmers.level1.strtoint;

public class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        String s = "-1234";

        System.out.println(sl.solution(s));
    }
}
