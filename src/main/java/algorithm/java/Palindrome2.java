package algorithm.java;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        Palindrome2 t = new Palindrome2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));

    }

    int start, end;
    public String solution(String s) {

        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len; i++) {
            System.out.println("i " +i);
            findSubString(s,i,i);
        }

        return s.substring(start, end +start);
    }

    private void findSubString(String s, int left, int right) {

        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if(end < right -left -1) {
            start = left+1;
            end = right - left -1;
        }
    }

}
