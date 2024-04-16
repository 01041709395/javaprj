import java.util. Scanner;
public class Memo6{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int hap = 0;
        int a,b;

        a = s.nextInt();
        b = s.nextInt();

        for(int i=a; i<=b; i+=4)


                hap += i;

            System.out.println(hap);
    }
}