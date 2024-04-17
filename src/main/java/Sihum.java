import java. util. Scanner;
public class Sihum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int a = s.nextInt();
        int b = s.nextInt();

        if(a<b) {
            for(int i=a; i<=b; i++) {
                if(i%2!=0)
                hap += i;
            }
        }
        else if(a>b) {
            for(int i=a; i>=b; i--) {
                if(i%2!=0)
                hap += i;
            }
        }
        System.out.println(hap);
    }
}
