package programmers.level0.uppercaseandlowercase;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char ch : my_string.toCharArray()){
            if(65 <= ch && ch <= 90){ // 대문자
                answer += Character.toString(ch+32);
            } else { // 소문자
                answer += Character.toString(ch-32);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cccCCC";
        System.out.println(sol.solution(my_string));
    }
}
