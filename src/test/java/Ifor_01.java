import java. util. Scanner;
public class Ifor_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dan;

        System.out.println("구구단 몇단? ");
        dan = s.nextInt();

        for(int i=1; i<10; i++)
            System.out.println(dan+ "*" +i+ "=" +dan*i);
    }


}
