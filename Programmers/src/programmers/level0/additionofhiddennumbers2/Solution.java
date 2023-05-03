package programmers.level0.additionofhiddennumbers2;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[A-Za-z]");
        for(String i : arr){
            if(!i.equals("")){
                answer += Integer.parseInt(i);
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
