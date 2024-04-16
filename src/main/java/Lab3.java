import java. util. Scanner;
public class Lab3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("나이 입력 ==> ");
        age = s.nextInt();

        if(age>=20) {
            System.out.println("즐거운 시간 보내세요.");
        }else {
            System.out.println("집에 갈 시간이네요");
        }System.out.println("협조감사합니다");
        s.close();
    }
}
