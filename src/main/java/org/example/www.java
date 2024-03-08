package org.example;

public class www {

    public static void main(String[] args) {



        int score = 95;
        String grade = "";

        System.out.println("학점부여");

        if(score>=95) {
            grade = "A+";
        } else if(score>=90) {
            grade = "A";
        } else if(score>=85) {
            grade = "B+";
        } else if(score>=80) {
            grade = "B";
        } else if(score>=75) {
            grade = "C";
        } else if(score>=70) {
            grade = "D";
        } else {
            grade = "F";
        } System.out.print("당신의 학점은"+grade+"입니다.");
    }
}