package 프로그래머스;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {

        int cnt = 0;
        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }
            cnt++;
        }

        return "김서방은 " +  cnt + "에 있다";
    }
}
