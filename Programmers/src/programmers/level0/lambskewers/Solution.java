package programmers.level0.lambskewers;

public class Solution {

    public int solution(int n, int k) {
//        양꼬치는 1인분에 12,000원
//        음료수는 2,000원
//        10인분을 먹으면 음료수 하나를 서비스
//        return : 양꼬치 n인분과 음료수 k개 총 얼마 지불
//        예) 10인분을 시켜 서비스로 음료수를 하나 받아 총 10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원입니다.
        return n * 12000 + k * 2000 - (n/10) * 2000;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 64;
        int k = 6;
        System.out.println(sol.solution(n,k));
    }
}
