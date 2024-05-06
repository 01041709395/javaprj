public class Ifor_03 {
    public static void main(String[] args) {

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 7; x++) {
                if (x >= 3 - y && x <= 3 + y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 5; x++) {
                if (x >= 1 + y && x <= 5 - y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}