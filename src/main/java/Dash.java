public class Dash {
    public static void main(String[] args) {

        int a = 200, b = 300;
        int hap = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0)
                hap += i;

        }
        System.out.println(hap);

    }
}
