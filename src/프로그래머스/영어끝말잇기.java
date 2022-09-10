package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        String[] arr = new String[]
                {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println("solution() = " + Arrays.toString(solution(5, arr)));
    }
    public static int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int people = 0;

        for (int i = 0; i < words.length; i++) {
            people++;
            for (String s : list) {
                if (Objects.equals(words[i], s)) {
                    i = words.length - 1;
                    list.remove(list.size() - 1);
                    break;
                }
            }

            if (!list.isEmpty()) {
                String last = list.get(list.size() - 1);
                if (last.charAt(last.length() - 1) != words[i].charAt(0)) {
                    list.remove(list.size() - 1);
                    break;
                }
            }

            list.add(words[i]);
        }
        System.out.println("list = " + list);

        if (list.size() == words.length) return new int[]{0, 0};


        System.out.println("people = " + people);

        // 몇번째 사람이 탈락했는가
        int peopleSequence;
        if (people % n == 0) {
            peopleSequence = n;
        } else {
            peopleSequence = people % n;
        }

        // 탈락한 사람이 자신의 몇번째 차례일 때 탈락했는지
        int sequence;
        if (people % n != 0) {
            sequence = people / n + 1;
        } else {
            sequence = people / n;
        }
        return new int[]{peopleSequence, sequence};
    }
}
