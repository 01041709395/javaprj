
public class For06 {
    public static void main(String[] args) {

        int hap = 0;

        for(int i=3; i<100; i++){ //3부터 100까지 조건이 맞을때마다 1씩 증가시키는 for문
            if(i%3==0) { //만약에 i의 나머지가 3일때 0가 같다
                hap += i;

            }
            }
         System.out.println(hap);


    }
}
