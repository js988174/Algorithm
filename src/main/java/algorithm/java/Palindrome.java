package algorithm.java;

import java.util.Scanner;

public class Palindrome {
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            } else {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome t = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
