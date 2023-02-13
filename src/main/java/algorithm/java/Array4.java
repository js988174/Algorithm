package algorithm.java;

import java.util.Scanner;

public class Array4 {

    public void solution(int n) {
        int a=1, b=1, c;
        for (int i=2; i< n; i++) {
            c=a+b;
            System.out.println(c+ "");
            a=b;
            b=c;
        }

    }

    public static void main(String[] args) {
        Array4 array4 = new Array4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array4.solution(n);
    }

}
