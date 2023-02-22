package programmers.level1.py;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 조건문
        // array[i] == p 라면 j++
        // array[i] == y 라면 k++
        // i == j 라면 answer == true
        // i != j 라면 answer == false

        String[] array = s.split("");

        int j = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("p") || array[i].equals("P")) {
                j++;
            }
            if (array[i].equals("y") || array[i].equals("Y")) {
                k++;
            }
        }

        if (j != k) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "py";
        String s1 = "Pyyp";

        System.out.println(sol.solution(s));
    }
}