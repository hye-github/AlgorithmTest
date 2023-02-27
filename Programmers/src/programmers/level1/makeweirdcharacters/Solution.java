package programmers.level1.makeweirdcharacters;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        for(int k = 0 ; k < arr.length ; k++){
            String[] wordArr = arr[k].split("");
            for(int i = 0 ; i < wordArr.length ; i++){
                wordArr[i] = (i%2==0) ? wordArr[i].toUpperCase() : wordArr[i].toLowerCase();
            }
            arr[k] = String.join("", wordArr);
        }

        answer += String.join(" ", arr);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "SSFDSFring toUpperCase     t oU pperCase  ckdksdfsdfsdfdsf              ";
        System.out.println(sol.solution(s));
    }
}
