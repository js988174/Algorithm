package algorithm.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StringBuilder {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new java.lang.StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringBuilder t = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x: t.solution(n, str)) {
            System.out.println(x);
        }
    }

}
