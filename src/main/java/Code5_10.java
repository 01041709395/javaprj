import java.util.Scanner;
public class Code5_10 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("입력하는 값 ==> ");

        num=s.nextInt();

        if(num%5==0 && num%3==0) {
            System.out.print("3의 배수 5의 배수 모두 만족합니다");
        }else if(num %5==0) {
            System.out.print("5의 배수입니다.");
        }else if(num %3==0) {
            System.out.print("3의 배수입니다.");
        }else {
            System.out.println("아무것도 만족 하지 못합니다");
        }
        s.close();
    }
}
