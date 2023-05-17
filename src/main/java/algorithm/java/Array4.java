package algorithm.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array4 {


        public int solution(int[] arr) {
            int answer = arr[0];

            // 주어진 배열의 모든 원소들의 최소공배수를 구하기 위해,
            // 주어진 배열의 모든 원소들을 하나씩 최소공배수와 계산해나갑니다.
            for (int i = 1; i < arr.length; i++) {
                answer = getLcm(answer, arr[i]);
            }

            return answer;
        }

        // 두 수의 최소공배수를 구하는 함수
        public int getLcm(int a, int b) {
            // 최소공배수는 두 수의 곱을 최대공약수로 나눈 값과 같습니다.
            int gcd = getGcd(a, b);
            return (a * b) / gcd;
        }

        // 두 수의 최대공약수를 구하는 함수 (유클리드 호제법 사용)
        public int getGcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return getGcd(b, a % b);
            }
        }


}
