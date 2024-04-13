import java.util.Scanner;
public class Memo5 { //초를 입력 받으면 시간,분,초로 분할해서 출력하는 코드
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //입력 받을 수 있게 scanner 함수 사용
        int x,t60,m60,c; // 입력 받을 초(x변수), 시간(t60), 분(m60), c(초)

        System.out.printf(" ## 계산할 초는 ? "); //printf나 print 둘중 아무거나 써도됨
        x = s.nextInt(); //입력 받을 변수(x) 정수입력메소드 사용

        t60 = x/3600; // 시간(t60) 변수에 입력 받을 x변수(입력 받을 초)
        x = x%3600; //초를 시간으로 바꾼후 나머지 초를 계산하기 위해 입력
        m60 = x/60;
        x = x%60;
        c = x/1;

        System.out.printf("시간은 ==> %d시간\n",t60);
        System.out.printf("분은 ==> %d분\n", m60);
        System.out.printf("초는 ==> %d초\n", c);


    }
}
