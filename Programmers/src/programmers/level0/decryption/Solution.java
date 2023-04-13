package programmers.level0.decryption;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherArr = cipher.split("");
        for(int i = 0 ; i < cipherArr.length ; i++){
            if((i+1) % code == 0){
                answer += cipherArr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(sol.solution(cipher,code));
    }
}
