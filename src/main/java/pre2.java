import java. util. Scanner;
public class pre2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int number1,number2;


        System.out.println("숫자 1 ==> ");
        number1 = s.nextInt();
        System.out.println("숫자 2 ==> ");
        number2 = s.nextInt();

        int add = number1+number2;
        int mul = number1*number2;
        int div = number1/number2;
        int rem = number1%number2;

        System.out.println(number1+ "+" + number2 + "=" +add);
        System.out.println(number1+ "*" + number2 + "=" +mul);
        System.out.println(number1+ "/" + number2 + "=" +div);
        System.out.println(number1+ "%" + number2 + "=" +rem);




    }
}
