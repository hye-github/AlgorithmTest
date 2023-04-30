package programmers.level0.ctrlz;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals("Z")){
                answer += Integer.parseInt(arr[i]);
                temp = Integer.parseInt(arr[i]);
            }
            if(arr[i].equals("Z")){
                answer -= temp;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "10 Z 20 Z 1";
        System.out.println(sol.solution(s));
    }
}
