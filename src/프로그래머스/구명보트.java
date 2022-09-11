package 프로그래머스;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people = new int[] {40, 50, 60, 70, 100, 200, 10, 20};
        System.out.println("solution(people, 100) = " + solution(people, 220));
    }

    public static int solution(int[] people, int limit) {
        int boat = 0;

        int sum = 0;
        for (int p : people) {
            sum += p;
        }

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            if (i + 1 > people.length) break;

            for (int j = people.length - 1; j >= 0; j--) {
                while (true) {
                    if (j != 0 && people[j] == 0) {
                        j--;
                    } else {
                        break;
                    }
                }
                if (people[i] + people[j] <= limit) {
                    people[i] = 0;
                    people[j] = 0;
                    break;
                }
            }

            if (people[i] != 0) people[i] = 0;

            System.out.println("sum = " + sum);

            int etc = 0;
            for (int p : people) {
                etc += p;
            }

            if (sum > etc) {
                boat++;
                sum = etc;
            }

            System.out.println(Arrays.toString(people));
        }

        return boat;
    }
}
