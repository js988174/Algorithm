package algorithm.java.Chap1;

import java.util.Scanner;

public class Chap1_Q7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값：");
        int n = scanner.nextInt();

        int sum = 0; 		// 합


        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}
