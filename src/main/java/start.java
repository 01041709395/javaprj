import java.util.Scanner;

public class start {
    public static void main(String[] args) {

        int a,b,c,d;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.println("첫번째 수를 더하기");
        a = s.nextInt();
        System.out.println("두번째 수를 더하기");
        b = s.nextInt();
        System.out.println("세번째 수를 더하기");
        c = s.nextInt();
        System.out.println("네번째 수를 더하기");
        d = s.nextInt();
        result = a + b + c + d;
        System.out.println(a+"+"+b+"+"+c+"+"+d+ "=" + result);

    }
}
