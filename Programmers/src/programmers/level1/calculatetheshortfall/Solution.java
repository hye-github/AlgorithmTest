package programmers.level1.calculatetheshortfall;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i=1 ; i<=count ; i++) {
            answer += (long) price * i;
        }

        if (money-answer >= 0) {
            return 0;
        }

        return (money-answer)*-1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(sol.solution(price, money, count));
    }
}
