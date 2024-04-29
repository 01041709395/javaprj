import java. util. Scanner;
public class Add01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str; //문자열 str 변쉬 지정

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();                 //문자열 입력 메소드 작성

        System.out.print("출력 문자열 ==> ");
        for(int i=0; i<str.length(); i++) { //i 0으로 초기화 시키고 0보다 문자열 길이가 작을때 문자열 길이를 1씩 증가 시킨다
            if (str.charAt(i) == '0') // chat : 문자열 위치에 접근하는 함수
                System.out.printf("%c", '@');
            else
                System.out.printf("%C", str.charAt(i));
        }



    }
}
