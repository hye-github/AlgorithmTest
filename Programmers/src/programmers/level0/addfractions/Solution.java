package programmers.level0.addfractions;

import java.util.Arrays;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int num = 0;

        for(int i = 1; i<=denom;i++){
            if(numer%i==0 && denom%i==0) num = i;
        }

        return  new int[]{numer/num,denom/num};

//        if (denom1 > denom2) {
//            if (denom1 % denom2 != 0) {
//                return new int[]{numer1 * denom2 + numer2 * denom1, denom1 * denom2};
//            } else {
//                return new int[]{(numer1 + numer2 * denom1 / denom2), denom1};
//            }
//        } else {
//            if (denom2 % denom1 != 0) {
//                return new int[]{numer1 * denom2 + numer2 * denom1, denom1 * denom2};
//            } else {
//                return new int[]{numer1 * denom2 / denom1 + numer2, denom2};
//            }
//        }
    }

    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 2;

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(numer1, denom1, numer2, denom2)));
    }
}
