package programmers.level1.seoulkim;

public class Solution {
    public String solution(String[] seoul) {
        String x = "";

        for (int i = 0; i < seoul.length; i++) {

            if (seoul[i].equals("Kim")) {
                x = String.valueOf(i);
            }

        }

        return "김서방은 " + x + "에 있다";
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        String[] seoul = new String[]{"Jane", "Kim"};

        System.out.println(sol.solution(seoul));
    }
}
