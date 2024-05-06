public class Ifor_02 {
    public static void main(String[] args) {

        for (int y = 0; y < 4; ++y) {
            for (int x = 0; x < 7; ++x) {
                if (x>= 3-y && x <= 3 + y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
