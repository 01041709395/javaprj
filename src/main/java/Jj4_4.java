import java. util. Scanner;
public class Jj4_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int score = 0;
        String grade = " ";

        System.out.print("점수를 입력하세요");

        score = s.nextInt();

        if(score>=90) {
            grade = "A";
        }else if(score>=80) {
            grade = "B";
        }else if(score>=70) {
            grade = "C";
        }else if(score>=60) {
            grade = "D";
        }else {
            grade = "F";
        }
        System.out.println("당신의 학점은" +grade+ "입니다");
    }
}
