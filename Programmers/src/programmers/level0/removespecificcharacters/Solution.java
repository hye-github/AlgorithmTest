package programmers.level0.removespecificcharacters;

public class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();
        String[] ms = my_string.split("");
        for(int i = 0 ; i < ms.length ; i++){
            if(!ms[i].equals(letter)){
                sb.append(ms[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(sol.solution(my_string,letter));
    }
}
