import java.io.IOException;
import java.util.Scanner;

public class add15 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int a, b;
        int result;
        char k;

        System.out.print("첫번째 수를 입력하세요 ==> ");
        a = s.nextInt();
        System.out.print("+-*/% ==> ");
        k = (char) System.in.read();
        System.out.print("두번째 수를 입력하세요 ==> ");
        b = s.nextInt();

        if (k == '+') {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (k == '-') {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == '*') {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println(a + "/" + b + "=" + result);
            } else {
                System.out.println("0으로 나누면 안됩니다.");
            }
            if (k == '%') {
                if (b != 0) {
                    result = a % b;
                    System.out.println(a + "%" + b + "=" + result);
                } else {
                    System.out.println("0으로 나누면 나머지 값이 안됩니다.");
                }
                s.close();
            }
        }
    }
}

