package programmers.level0.adddigits;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = Integer.toString(n);
        String[] nStrArr = nStr.split("");
        for (String s : nStrArr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 930211;
        System.out.println(sol.solution(n));
    }
}
