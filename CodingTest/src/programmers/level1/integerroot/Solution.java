package programmers.level1.integerroot;

//        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

//        입출력 예
//        n	return
//        121	144
//        3	-1

//        121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
//
//        입출력 예#2
//        3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

class Solution {

//    실패 (시간 초과)
//    채점 결과
//    정확성: 55.6
//    public long solution(long n) {
//        long answer = -1;
//        for(int x = 1; x < n/2; x++){
//            if(n == x * x){
//                answer = (long) (x + 1) * (x + 1);
//            }
//        }
//        return answer;
//    }

//    채점 결과
//    정확성: 61.1
//    public long solution(long n) {
//        long answer = -1;
//        int x = (int) Math.sqrt((double) n);
//        if(n == x*x){
//            answer = (long) (x + 1) * (x + 1);
//        }
//        return answer;
//    }

//    채점 결과
//    정확성: 83.3
//    public long solution(long n) {
//        long answer = -1;
//        double x = Math.sqrt((double) n);
//            if(n == Math.pow(x,2)){
//                answer = (long) ((int) x + 1) * ((int) x + 1);
//            }
//        return answer;
//    }

//    채점 결과
//    정확성: 83.3
//    public long solution(long n) {
//        long answer = -1;
//        double x = Math.sqrt((double) n);
//        if (n == (long) Math.pow(x, 2)) {
//            answer = (long) ((int) x + 1) * ((int) x + 1);
//        }
//        return answer;
//    }

//    채점 결과
//    정확성: 83.3
//    public long solution(long n) {
//        long answer = -1;
//        for (long x = 1; x < n/2; x++) {
//            if (n == x * x) {
//                answer = (x + 1) * (x + 1);
//            }
//        }
//        return answer;
//    }


    // 정답
//    public long solution(long n) {
//        long answer = -1;
//        for (long x = 1; x <= Math.sqrt(n); x++) {
//            if (n == x * x) {
//                answer = (x + 1) * (x + 1);
//            }
//        }
//        return answer;
//    }

    public long solution(long n) {
        if(n==1){
            return 4;
        }
        for (long x = 1; x <= n/2; x++) {
            if (n == x * x) {
                return (x + 1) * (x + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1));
    }
}