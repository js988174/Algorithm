package algorithm.java.Chap1;

import java.util.Scanner;

public class Chap1_Q10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 값：");
        int a = scanner.nextInt();
        int b=0;

        while (true) {
            System.out.print("b의 값：");
             b = scanner.nextInt();

            if (b > a)
                break;

                System.out.println("a보다 큰 값을 입력하세요!");

        }

        System.out.println("b - a는 " + (b - a) + "입니다.");

    }
}
