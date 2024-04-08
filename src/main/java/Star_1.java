public class Star_1 {
    public static void main(String[] args) {

        for(int i=0; i<6; i++) {
            for(int j = 5; j > 0; j--){
                if(i < j){
                    System.out.println(" ");
                } else
                    System.out.println("*");
            }
        }
    }
}
