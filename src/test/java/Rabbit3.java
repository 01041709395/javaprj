class Rabbit_0{
    String shape;
    int xPos; //변수명 같게.this쓰면 변수 구별 가능
    int yPos;
    Rabbit_0(String shape) {
        this.shape = shape; //sharpe 변수에 토끼값을 대입하여 메모리에 올려라 메모리 생생할때 생성자 생성됨
    } //내 맘대로 생성자 변경 가능
    void setPosition(int x,int y) {
        this.xPos = x;//어떤게 클라스인지 어떤게 자바변수인지 확인 하기 위해
        this.yPos = y;//클래스 변수 의미
    }
}
public class Rabbit3 {
    public static void main(String[] args) {
        String rabbitColor = "파란색";
         // new 호출 된 함수가 위에 있는 rabbit_0() 함수
        Rabbit_0 rabbit = new Rabbit_0(rabbitColor);

        System.out.printf("터끼 객체의 기본 모양은 [%s]입니다.",rabbit.shape);
    }
}
