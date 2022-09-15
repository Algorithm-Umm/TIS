package 프로그래머스;

import java.util.ArrayList;

public class 행렬의_곱셈 {
    public static void main(String[] args) {
        solution(new int[][]{{1, 4},{3, 2},{4, 1}}, new int[][]{{3, 3}, {3, 3}});
    }
    public static void solution(int[][] arr1, int[][] arr2) {
        // arr2의 첫번째 원소의 결과만 출력됨 -> arr2의 마지막 원소까지 출력해야함
        // arr1의 1차원배열
        for (int[] arr : arr1) {
            int sum = 0;

            for (int value : arr) {

                // arr2의 2차원배열
                for (int[] ar : arr2) {
                    for (int value2 : ar) {

                        System.out.println("sum = " + value * value2);
                        sum += value * value2;

                        break;
                    }
                    break;
                }

                System.out.println("result = " + sum);
            }

            System.out.println();
        }
    }
}
