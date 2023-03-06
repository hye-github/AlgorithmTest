package programmers.level1.year2016;

public class Solution {

    public String solution(int a, int b) {
        String answer = "";
        String SUN = "SUN";
        String MON = "MON";
        String TUE = "TUE";
        String WED = "WED";
        String THU = "THU";
        String FRI = "FRI";
        String SAT = "SAT";

//        어? 월화수목금토일 7개로 반복. 숫자 더해서 반복해서 흠...

        if(a==1){
            if(b%7==1) {
                return "FRI";
            } else if(b%7==2) {
                return "SAT";
            } else if(b%7==3) {
                return "SUN";
            } else if(b%7==4) {
                return "MON";
            } else if(b%7==5) {
                return "TUE";
            } else if(b%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==2){
            if(b+28%7==1) {
                return "FRI";
            } else if(b+28%7==2) {
                return "SAT";
            } else if(b+28%7==3) {
                return "SUN";
            } else if(b+28%7==4) {
                return "MON";
            } else if(b+28%7==5) {
                return "TUE";
            } else if(b+28%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==3){
            if(b+28+31%7==1) {
                return "FRI";
            } else if(b+28+31%7==2) {
                return "SAT";
            } else if(b+28+31%7==3) {
                return "SUN";
            } else if(b+28+31%7==4) {
                return "MON";
            } else if(b+28+31%7==5) {
                return "TUE";
            } else if(b+28+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==4){
            if(b+28+31+30%7==1) {
                return "FRI";
            } else if(b+28+31+30%7==2) {
                return "SAT";
            } else if(b+28+31+30%7==3) {
                return "SUN";
            } else if(b+28+31+30%7==4) {
                return "MON";
            } else if(b+28+31+30%7==5) {
                return "TUE";
            } else if(b+28+31+30%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==5){
            if(b+28+31+30+31%7==1) {
                return "FRI";
            } else if(b+28+31+30+31%7==2) {
                return "SAT";
            } else if(b+28+31+30+31%7==3) {
                return "SUN";
            } else if(b+28+31+30+31%7==4) {
                return "MON";
            } else if(b+28+31+30+31%7==5) {
                return "TUE";
            } else if(b+28+31+30+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==6){
            if(b+28+31+30+31+30%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==7){
            if(b+28+31+30+31+30+31%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==8){
            if(b+28+31+30+31+30+31+31%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31+31%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31+31%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31+31%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31+31%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==9){
            if(b+28+31+30+31+30+31+31+30%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31+31+30%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31+31+30%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31+31+30%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31+31+30%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31+31+30%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==10){
            if(b+28+31+30+31+30+31+31+30+31%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31+31+30+31%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31+31+30+31%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31+31+30+31%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31+31+30+31%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31+31+30+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==11){
            if(b+28+31+30+31+30+31+31+30+31+30%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31+31+30+31+30%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31+31+30+31+30%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31+31+30+31+30%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31+31+30+31+30%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31+31+30+31+30%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        } else if(a==12){
            if(b+28+31+30+31+30+31+31+30+31+30+31%7==1) {
                return "FRI";
            } else if(b+28+31+30+31+30+31+31+30+31+30+31%7==2) {
                return "SAT";
            } else if(b+28+31+30+31+30+31+31+30+31+30+31%7==3) {
                return "SUN";
            } else if(b+28+31+30+31+30+31+31+30+31+30+31%7==4) {
                return "MON";
            } else if(b+28+31+30+31+30+31+31+30+31+30+31%7==5) {
                return "TUE";
            } else if(b+28+31+30+31+30+31+31+30+31+30+31%7==6) {
                return "WED";
            } else {
                return "THU";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5;
        int b = 24;
        System.out.println(sol.solution(a, b));
    }
}
