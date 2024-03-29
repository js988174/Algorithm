package algorithm.java.Chap2;

import java.util.Scanner;

public class Chap2_Q1 {

    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요솟수：");
        int na = stdIn.nextInt();		// 배열 a의 요솟수

        int[] a = new int[na];			// 요솟수가 na인 배열

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요솟수：");
        int nb = stdIn.nextInt();		// 배열 b의 요솟수

        int[] b = new int[nb];			// 요솟수가 nb인 배열

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a와 b는 " +
                (equals(a, b) ? "같습니다."
                        : "같지 않습니다."));
    }
}
