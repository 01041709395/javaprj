import java. util. Scanner;
public class Memo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 입력하기 위해 스캐너 함수를 사용했습니다

      int a = s.nextInt(); //정수형 값을 받기 위해 a,b 의 변수선언과 입력 메소드 입력했습니다
      int b = s.nextInt();

        int hap = 0; //hap 변수를 사용하기 위해서 0으로 초기값으로 선언하고 초기화 한다.

        for(int i=a+1; i<b; i+=2) { //  변수 a,b 사이에 홀수를 출력해야하므로 초기값에 1을 더하고 i가 b보다 작은 조건이 성립할때 2씩 증감하는 반복문을 작성했습니다.
            hap = hap + i; // 조건이 성립할때마다 hap의 값과 i값을 더해줍니다

        }
        System.out.println(hap); //반복문 밖에서 출력해야 홀수의 합계가 출력됩니다.

    }
}

