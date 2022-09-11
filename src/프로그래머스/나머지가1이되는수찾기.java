package 프로그래머스;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int cnt = 2;
        while (n % cnt != 1) {
            cnt++;
        }

        return cnt;
    }
}
