package programmers.level0.clothingstorediscount;

public class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return price * (100 - 20) / 100;
        } else if (price >= 300000) {
            return price * (100 - 10) / 100;
        } else if (price >= 100000) {
            return price * (100 - 5) / 100;
        } else {
            return price;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 150000;
        System.out.println(sol.solution(price));
    }
}
