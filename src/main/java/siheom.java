import java.util.Scanner;
public class siheom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("숫자입력 ==> ");
        num = s.nextInt();

        if(num>100) {
            if (num < 1000) {
                System.out.println("100보다 크고 1000보다 작군요");
            } else {
                System.out.println("1000보다 크군요");
            }
        }else {
            System.out.println("100보다 작군요");
        }
        s.close();
    }
}
