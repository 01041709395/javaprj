import java.util.Scanner;
public class For7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int hap = 0;
       int num;
       System.out.print("값 입력 : ");
       num = s.nextInt();
       for(int i=1; i<=num; i++){
           hap += i;
       }
       System.out.println(hap);
    }
}
