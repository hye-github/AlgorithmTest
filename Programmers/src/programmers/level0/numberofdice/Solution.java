package programmers.level0.numberofdice;

public class Solution {
    public int solution(int[] box, int n) {
        int answer[] = {0,0,0};
        for(int i = 0 ; i < 3 ; i++){
            answer[i] = box[i] / n;
        }
        return answer[0]*answer[1]*answer[2];
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(sol.solution(box,n));
    }
}
