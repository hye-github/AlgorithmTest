package programmers.level1.phonenum;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        for(int i = 0; i< arr.length-4; i++) {
            arr[i] = "*";
        }
        for(int i = 0; i< arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("01033334444"));
    }
}
