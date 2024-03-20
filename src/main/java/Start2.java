public class Start2 {
    public static void main(String[] args) {
        int cub = 0;

        for(int i=500; i<=1000; i+=2){
            cub += i;
        }
        System.out.println("500부터 1000까지 짝수의 합계 : "+ cub);
    }
}
