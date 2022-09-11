package 프로그래머스;

public class 짝수와_홀수 {
    public String solution(int num) {
        if(num%2 == 1 || num%2 == -1)
            return "Odd";
        return "Even";
    }
}
