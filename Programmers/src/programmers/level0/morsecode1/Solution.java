package programmers.level0.morsecode1;
public class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(".-")){
                answer.append("a");
            } else if (str[i].equals("-...")) {
                answer.append("b");
            } else if (str[i].equals("-.-.")) {
                answer.append("c");
            } else if (str[i].equals("-..")) {
                answer.append("d");
            } else if (str[i].equals(".")) {
                answer.append("e");
            } else if (str[i].equals("..-.")) {
                answer.append("f");
            } else if (str[i].equals("--.")) {
                answer.append("g");
            } else if (str[i].equals("....")) {
                answer.append("h");
            } else if (str[i].equals("..")) {
                answer.append("i");
            } else if (str[i].equals(".---")) {
                answer.append("j");
            } else if (str[i].equals("-.-")) {
                answer.append("k");
            } else if (str[i].equals(".-..")) {
                answer.append("l");
            } else if (str[i].equals("--")) {
                answer.append("m");
            } else if (str[i].equals("-.")) {
                answer.append("n");
            } else if (str[i].equals("---")) {
                answer.append("o");
            } else if (str[i].equals(".--.")) {
                answer.append("p");
            } else if (str[i].equals("--.-")) {
                answer.append("q");
            } else if (str[i].equals(".-.")) {
                answer.append("r");
            } else if (str[i].equals("...")) {
                answer.append("s");
            } else if (str[i].equals("-")) {
                answer.append("t");
            } else if (str[i].equals("..-")) {
                answer.append("u");
            } else if (str[i].equals("...-")) {
                answer.append("v");
            } else if (str[i].equals(".--")) {
                answer.append("w");
            } else if (str[i].equals("-..-")) {
                answer.append("x");
            } else if (str[i].equals("-.--")) {
                answer.append("y");
            } else if (str[i].equals("--..")) {
                answer.append("z");
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String letter = ".... . .-.. .-.. ---";
        System.out.println(sol.solution(letter));
    }
}
