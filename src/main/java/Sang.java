class Dice{ //dice 클래스 지정
    private int number; // 객체 변수 숫자 지정

    public void setNumber(int number) { //값을 변경할수 있는 함수
        this.number = number;
    }
    public int getNumber() { // 값을 알려주는 함수
        return this.number;
    }
}

public class Sang {
    public static void main(String[] args) {
        int count = 0;
        Dice dice1 = new Dice();  //던진 횟수 저장할 변수와 세 주사위 객체
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();

        while(true) {
            count ++;
            dice1.setNumber((int)(Math.random()*6+1)); //숫자 6으로 지정 3번 반복할때마다 1씩 증가
            dice2.setNumber((int)(Math.random()*6+1));
            dice3.setNumber((int)(Math.random()*6+1));

            if((dice1.getNumber() == dice2.getNumber()) && (dice2.getNumber() == dice3.getNumber()))
                break; //숫자 3개 같으면 무한반복 해제
        }
        System.out.printf("3개 주사위는 모두 %d입니다.\n",dice1.getNumber());
        System.out.printf("같은 숫자가 나올때까지 %d번 던졌습니다.\n",count);
    }
}
