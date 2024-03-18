import java.util.Scanner;
public class Pre1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String id,name,male;

        System.out.println("아이디 ==> ");
        id = s.next();
        System.out.println("이름 ==> ");
        name = s.next();
        System.out.println("메일 ==> ");
        male = s.next();

        System.out.println("아이디는 "+id+ "이며, 이름은" +name+ "이며, 이메일은" +male+ "입니다.");

        s.close();






    }
}