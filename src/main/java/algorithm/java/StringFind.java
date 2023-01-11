package algorithm.java;

import java.util.Scanner;

public class StringFind {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println("-----------------");
        System.out.println(str + " " + t);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        System.out.println("-----------------");

        return answer;
    }

    public static void main(String[] args) {
        StringFind s = new StringFind();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(s.solution(str, c));

    }
}
