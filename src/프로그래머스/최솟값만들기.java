package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
    public int solution(int[] A, int[] B) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            listA.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            listB.add(B[i]);
        }

        Collections.sort(listA);
        listB.sort(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < listA.size(); i++) {
            sum += listA.get(i) * listB.get(i);
        }

        return sum;
    }
}
