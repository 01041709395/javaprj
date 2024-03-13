import java.util.Scanner;
public class add2 {
    public static void main(String[] args) {
        int a,b;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.println("두 정술르 공백으로 구분하여 입력하세요.");

        System.out.println("첫번째 수");
        a = s.nextInt();
        System.out.println("두번째 수");
        b = s.nextInt();

        result = a*b;
        System.out.println(a+"*"+b+"=" +result);



    }
}
