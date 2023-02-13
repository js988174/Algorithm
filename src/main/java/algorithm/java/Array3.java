package algorithm.java;

import java.util.Scanner;

public class Array3 {


    public String solution(int n, int[] a, int[] b) {

        java.lang.StringBuilder answer= new java.lang.StringBuilder();
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer.append("D");
            } else if (a[i] == 1 && b[i] == 3) {
                answer.append("A");
            } else if (a[i] == 2 && b[i] == 1) {
                answer.append("A");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Array3 array3 = new Array3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(array3.solution(n, a, b));


    }
}
