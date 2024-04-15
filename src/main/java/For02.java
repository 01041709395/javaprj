import java. util. Scanner;
        public class For02{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int a,b,c;

        System.out.print("시작값 입력 : ");
        a = s.nextInt();
        System.out.print("끝 값 입력 : ");
        b = s.nextInt();
        System.out.print("증가 값 : ");
        c = s.nextInt();

        for(int i=a; i<=b; i+=c) {
            hap+=i;

        }
    System.out.println(a+"에서"+b+"까지"+c+"씩 증가한 값의 합 : "+hap);

    }
        }