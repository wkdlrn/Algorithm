import java.util.Scanner;

public class Main {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str+ " " + t);
        /*for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) answer ++;
        }*/
        for (char x: str.toCharArray()
        ) {
            if(x==t) answer++;
            //향상된 for문 ":"뒤에 오는 것 배열, 어레이리스트가 올 수 있음. 스트링 x
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str,c));
    }
}

