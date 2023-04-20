package programmers.level0.replaceindex;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        String temp = "";
        String[] strArr = my_string.split("");
        temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;
        return String.join("", strArr);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        System.out.println(sol.solution(my_string,num1,num2));
    }
}
