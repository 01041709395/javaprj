class Car { //슈퍼 클래스 car 클래스 만들기
    String color;
    int speed;

    void upSpeed(int value) {
        speed = speed+value;
    }
    void downSpeed(int value) {
        speed = speed-value;
    }
}

class Nexs extends Car { //서브 클래스인 Nexs 클래스 만들기
    int seatNum;      //extends Car 슈퍼클래스 상속 받고 추가로 슈퍼클래스에 없는 seatNum 필드와 getSeatNum() 메소드 구현

    int getSeatNum() {
        return seatNum;
    }
}

class Nexse extends Car { //서브 클래스인 Nexse 클래스 만들기
    int capacity; // extends car 슈퍼클래스 상속 받고 추가로 capacity 필드와 getcapacity() 메소드 구현

    int getCapacity() {
        return capacity;
    }
}
public class Sangso {
    public static void main(String[] args) {

        Nexs nexs1 = new Nexs();    // nexs와 nexse 인스턴스 생성
        Nexse nexs2 = new Nexse();

        nexs1.upSpeed(300);
        nexs2.upSpeed(100);

        nexs1.seatNum = 5;
        nexs2.capacity = 50;

        System.out.println("승용차의 속도는"+nexs1.speed+"km이며, 좌석수는" +nexs1.getSeatNum()+"개 입니다.");
        System.out.println("트럭 속도는"+nexs2.speed+"km이며, 적재량은"+nexs2.getCapacity()+"톤 입니다");
    }
}
