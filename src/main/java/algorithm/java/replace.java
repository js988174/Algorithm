package algorithm.java;

import java.util.Scanner;

public class replace {

    public int solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            System.out.println(tmp+ "" + num);
            s= s.substring(7);

        }

        return Integer.parseInt(answer);
    }



    public static void main(String[] args) {
        replace T = new replace();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        System.out.println(T.solution(n, str));
    }
}
