package programmers.level1.intltos;

class Solution {
    public long solution(long n) {
        String[] arrayN = Long.toString(n).split("");
        for(int i=0; i<arrayN.length-1; i++){
            for(int j=i+1; j<arrayN.length; j++){
                if(Integer.parseInt(arrayN[i]) < Integer.parseInt(arrayN[j])){
                    String tmp=arrayN[i];
                    arrayN[i]=arrayN[j];
                    arrayN[j]=tmp;
                }
            }
        }

        String answer = "";

        for(String i:arrayN){
            answer += i;
        }

        return Long.parseLong(answer);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(118372));
    }

}
