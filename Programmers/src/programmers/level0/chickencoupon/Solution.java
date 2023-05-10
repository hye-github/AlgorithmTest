package programmers.level0.chickencoupon;

public class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = 0;
        int coupon = chicken;
        while (coupon >= 1) {
            temp += coupon % 10;
            coupon = coupon / 10;
            answer += coupon;
            if(temp >= 10){
                answer += 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int chicken = 1081;
        System.out.println(sol.solution(chicken));
    }
}
