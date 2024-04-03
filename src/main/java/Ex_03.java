import java. util. Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        num = s.nextInt();

        if(num%21==0) {
            System.out.println("3과 7의 배수를 모두 만족합니다.");
        }else if(num%7==0) {
            System.out.println("7의 배수입니다.");
        }else if(num%3==0) {
            System.out.println("3의 배수입니다.");
        }
        s.close();
    }
}
