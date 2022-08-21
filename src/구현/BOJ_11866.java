package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        System.out.print("<");
        do {
            for (int i = 0; i < M; i++) {
                if (i == M - 1) {
                    if (queue.size() == 1) {
                        System.out.print(queue.peek());
                        queue.remove();
                    } else {
                        System.out.print(queue.peek() + ", ");
                        queue.remove();
                    }
                } else {
                    queue.add(queue.peek());
                    queue.remove();
                }
            }
        } while (queue.size() != 0);
        System.out.print(">");
    }
}
