class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x,int y) { //메모리에 올릴수 있도록 도와주는 함수
       this.xPos = x;
       this.yPos = y;

        System.out.println("xPos : " +this.xPos+ " / ypos : "+this.yPos);
    }
}
public class Rabbit2 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit(); //new(함수) :객체에 메모리 올려주기 ,객체에 메모리 올려줄때 도와주는 함수가 생성자
        Rabbit rabbit2 = new Rabbit(); //객체2 생성자()라는 함수 만들어줬음,생성자 함수가 실행되서 올라감
        Rabbit rabbit3 = new Rabbit(); //객체3 클래스 명과 함수 명이 동일하다

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        System.out.println("rabbit1.shape : "+ rabbit1.shape); //객체에 존재하는 변수값 불러오기
        System.out.println("rabbit2.shape : "+ rabbit2.shape);
        System.out.println("rabbit3.shape : "+ rabbit3.shape);

        rabbit1.setPosition(100,100); //각자 객체 올라갔으므로 함수도 독립적으로 작성
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,100);
    }
}
