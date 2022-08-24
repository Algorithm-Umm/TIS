package 프로그래머스;

import java.util.ArrayList;

public class 소수만들기 {
    public int solution(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i + 2 == nums.length) break;

            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    arr.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int answer = 0;


        for (int i : arr) {
            int sum = 2;
            answer++;

            do {
                if (i % sum == 0) {
                    answer--;
                    break;
                }
                sum++;
            } while (sum < i);
        }

        return answer;
    }
}
