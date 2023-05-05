package programmers.level0.loginsucceed;

public class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] idpw : db){
            if(idpw[0].equals(id_pw[0]) && !idpw[1].equals(id_pw[1])){
                return  "wrong pw";
            } else if(idpw[0].equals(id_pw[0]) && idpw[1].equals(id_pw[1])){
                return  "login";
            }
        }
        return "fail";
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(sol.solution(id_pw,db));
    }
}
