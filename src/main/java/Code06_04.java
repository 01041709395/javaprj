import java.util.Scanner;
public class Code06_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if (a > b) { // a가 b보다 클때
            for (int i = a; i > b; i--) { // i가 a랑 같을때 (a가 200일때) a가 b보다 클때 감소 연산자
                if (i % 3 == 0) { // 만약의 a를 3으로 나누었을때 나머지가 0이될때
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i < b; i++) { //위에 조건이 해당이 안될시 a가 b보다 작을 때

                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}