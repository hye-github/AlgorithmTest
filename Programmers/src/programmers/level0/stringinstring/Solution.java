package programmers.level0.stringinstring;

public class Solution {
    public int solution(String str1, String str2) {
        String[] str1Arr = str1.split(str2);
        if(str1 == str2){
            return 1;
        }
        else if(str1Arr.length > 1){
            return str1Arr.length;
        }
        return str1Arr.length;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "Klmn1o";
        System.out.println(sol.solution(str1,str2));
    }
}
