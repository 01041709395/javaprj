import java. util. Scanner;
public class If01 {
    public static void main(String[] args) { //표준 점수의 상위 비율을 입력 받고 등급을 출력하는 프로그램
    Scanner s = new Scanner(System.in);
    float grade;
    System.out.println("수능 성적 상위 비율을 입력하세요");
    grade = s.nextFloat();

    if(grade<=4) {
        System.out.println("1등급입니다");
    }else if(grade<=11) {
        System.out.println("2등급입니다");
    }else if(grade<=23) {
        System.out.println("3등급입니다");
    }else if(grade<=40) {
        System.out.println("4등급입니다");
    }else if(grade<=60) {
        System.out.println("5등급입니다");
    }else if(grade<=77) {
        System.out.println("6등급입니다");
    }else if(grade<=89) {
        System.out.println("7등급입니다");
    }else if(grade<=96) {
        System.out.println("8등급입니다");
    }else if (grade<=100) {
        System.out.println("9등급입니다");
    }
    }
}
