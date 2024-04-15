public class For08 {
    public static void main(String[] args) {

        for (int i=2; i<10; i++)
            System.out.printf("  #제%d단#", i);

        System.out.printf("\n\n");

        for(int i=2; i<10; i++) {
            for(int k=1; k<10; k++ ){
                System.out.printf("%2dX%2d=%2d",i,k,i*k);
            }
            System.out.printf("\n");
        }
    }
}
