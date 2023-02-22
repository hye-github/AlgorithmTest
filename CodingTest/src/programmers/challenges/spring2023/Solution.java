package programmers.challenges.spring2023;

class Solution {
    public int solution(int[][] lotteries) {
        int answer = 0;

//        lotteries[i][0] = 당첨자수
//        lotteries[i][1] = 구매한 사람 수
//        lotteries[i][2] = 당첨 금액

        int max = 0;
        double doubleMax = 0;

        for (int i = 0; i < lotteries.length; i++) {
            int lotteriesWin = lotteries[i][0];
            int lotteriesBuy = lotteries[i][1];

            if ((lotteriesWin / lotteriesBuy) > doubleMax) {
                doubleMax = (lotteriesWin / lotteriesBuy);
            }


            if ((lotteriesWin / lotteriesBuy) == doubleMax) {
                int[] intArray = new int[lotteries.length];
                max = intArray[0];

                for (int j = 1; j < intArray.length; j++) {
                    if (lotteries[i][2] > max) {
                        max = lotteries[i][2];
                    }
                }
            }

            if (lotteries[i][2] == max) {
                answer = i + 1;
                break;
            }
        }

        return answer;

    }
}



//    SELECT BRANCH_ID, NAME
//    FROM EMPLOYEES
//    INNER JOIN(
//            SELECT BRANCH_ID MAX_BRANCH_ID, MAX(SALARY) MAX_SALARY
//    FROM EMPLOYEES
//    GROUP BY BRANCH_ID
//        ) M ON M.MAX_BRANCH_ID = EMPLOYEES.BRANCH_ID AND M.MAX_SALARY = EMPLOYEES.SALARY
//        ORDER BY BRANCH_ID, NAME;
