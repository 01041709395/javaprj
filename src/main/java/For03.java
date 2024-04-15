import java. util. Scanner;
public class For03 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int dan;

        System.out.print("몇 단 ? ");
        dan = s.nextInt();

        for(int i=9; i>=1; i--) {
            System.out.println(dan+"*"+i+"="+dan*i);
            }
    }
}
