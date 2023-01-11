package algorithm.java;

import java.util.Scanner;

public class UpperCase {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        UpperCase up = new UpperCase();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(up.solution(str));
    }
}
