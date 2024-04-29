import java.util.Scanner;
public class Code2_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num;
        System.out.println("실수를 입력하세요 : ");
        num = s.nextDouble();
        System.out.println("사용자가 입력한 값 ==> " + num);

        String str;
        System.out.println("문자열을 입력하세요 :");
        str = s.next();
        System.out.println("사용자가 입력한 값 ==> " + str);

        long num2;
        System.out.println("정수를 입력하세요 : ");
        num2 = s.nextLong();
        System.out.println("내가 입력한 값 ==> " + num2);

        System.out.println("원지름은 "+num+"이고 "+str+" 값은 "+num2+" 입니다");

        s.close();
    }
}
