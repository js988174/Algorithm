package algorithm.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array1 array1 = new Array1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : array1.solution(n, arr)) {
            System.out.println(x + " ");
        }

    }

}
