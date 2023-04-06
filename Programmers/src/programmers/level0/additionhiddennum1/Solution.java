package programmers.level0.additionhiddennum1;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0 ; i < my_string.length() ; i++) {
            if(Character.isDigit(my_string.charAt(i))){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(sol.solution(my_string));
    }
}
