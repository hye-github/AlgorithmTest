package programmers.level0.printtextrepeat;

public class Solution {
    public String solution(String my_string, int n) {
        String[] ms = my_string.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < ms.length ; i++) {
            for(int j = 0; j<n; j++) {
                sb.append(ms[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int n = 3;
        System.out.println(sol.solution(my_string,n));
    }
}
