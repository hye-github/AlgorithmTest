package programmers.level1.smallestnum;

public class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }

        int j = 0;
        int k = 0;
        int i = 0;

        for(i =0 ; arr.length <i ; i++){
            j += i;
            if(arr[i] < arr[j]){
                j = i;
            } else {
                k = i;
            }
        }



        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10};
        System.out.println(sol.solution(arr));
    }
}
