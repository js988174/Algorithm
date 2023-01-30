package algorithm.java;

import java.util.Scanner;

public class StringLength {

    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p=0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        StringLength s = new StringLength();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : s.solution(str, c)) {
            System.out.println(x + " ");
        }

    }
}
