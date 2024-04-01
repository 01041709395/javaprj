import java.util.Scanner;
public class Code5_0 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int cal ;

        System.out.print("결제를 진행 하시겠습니까??");

        cal = s.nextInt();
        if(cal>=3000) {
            System.out.println("결제 완료");
        }else {
            System.out.println("결제 취소");
        }
        s.close();
    }
}
