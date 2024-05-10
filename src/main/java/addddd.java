import java. util.Scanner;
public class addddd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int hap = 0;        //hap 이라는 변수를 사용하기위해 0이라는 초기값을 설정하고 초기화 선언했습니다
            int a,b,c;
            System.out.print("초깃값 ==> ");
            a = s.nextInt();
            System.out.print("끝값 ==> ");
            b = s.nextInt();
            System.out.print("증갓값 ==> ");
            c = s.nextInt();

        for (int i=a; i<=b; i+=c) {
            hap = hap + i;
        }
        System.out.print(hap);
    }
}