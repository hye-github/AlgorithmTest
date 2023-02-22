package programmers.level1.collatz;

public class Solution {
    public int solution(int num) {
        int answer = 0;

        if(num==1){
            return 0;
        }

        for(int i=0;i<500;i++){
            num = (num%2==0) ? num/2 : num*3+1;
            answer++;

            // num이 int 범위 내에 있는지 체크
            if (num < 0) {
                return -1;
            } else if(num==1){
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int num = 626331;
        int answer = 0;

        for(int i=0;i<500;i++){
            num = (num%2==0) ? num/2 : num*3+1;
            answer++;

            // 오버플로우 보려고 sysout 작성함
            System.out.println("num: " + num + " / answer : " + answer);
            if(num==1){
                System.out.println(answer);
            }
        }

    }
}
