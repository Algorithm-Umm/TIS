package 프로그래머스;

public class 주식가격 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 2, 3};
        for (int i : solution(arr)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] prices) {

        int[] arr = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            if (i + 1 == prices.length) break;
            int cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    cnt++;
                } else {
                    cnt++;
                    break;
                }
            }

            arr[i] = cnt;
        }

        return arr;
    }
}
