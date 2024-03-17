import java.util.Scanner;
public class Ex03_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int score = 0;

        System.out.println("필기시험 점수를 입력하세요:");
        score = s.nextInt();
        System.out.println(score >= 70);


    }
}
