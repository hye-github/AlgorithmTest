package programmers.level0.rockscissorspaper;

public class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        for(char ch:rsp.toCharArray()){
            if(ch == '2'){
                ch = '0';
            } else if(ch == '0'){
                ch = '5';
            } else {
                ch = '2';
            }
            sb.append(ch+"");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "205";
        System.out.println(sol.solution(rsp));
    }
}
