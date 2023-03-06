package programmers.level1.caesarcipher;
public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32){
                answer += " ";
            } else if (s.charAt(i) + n > 122) {
                answer += (char) (s.charAt(i) + n - 26);
            } else {
                answer += (char) (s.charAt(i) + n);
            }
        }

//          65 <= s.charAt(i)+n <= 90
//          97 <= s.charAt(i)+n <= 122

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcdefg ABCDZXY";
        int n = 4;
        System.out.println(sol.solution(s, n));
    }
}


