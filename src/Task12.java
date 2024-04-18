import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Task12");
//        for (int i = 0; i <= 6 ; i++) {
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a;
        int uch = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            if (a < 30.0) {
                uch++;
            }
        }
        System.out.printf("%.0f %d\n", Math.ceil(200.0 * uch / 900), uch);
    }
}
