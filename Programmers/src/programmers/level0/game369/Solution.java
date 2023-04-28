package programmers.level0.game369;
public class Solution {
    public int solution(int order) {
        int answer = 0;
        String strInt = String.valueOf(order);
        String[] intArr = strInt.split("");
        for (String str : intArr){
            if(str.equals("3")||str.equals("6")||str.equals("9")){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 29423;
        System.out.println(sol.solution(order));
    }
}
