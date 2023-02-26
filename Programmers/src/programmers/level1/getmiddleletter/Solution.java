package programmers.level1.getmiddleletter;

public class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        int i = arr.length;
        return i%2==0 ? arr[i/2-1]+arr[i/2] : arr[i/2];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "qwer";
        System.out.println(sol.solution(s));
    }
}
