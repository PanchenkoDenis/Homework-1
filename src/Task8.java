import java.util.Scanner;

public class Task8 {
    public static final double V = 330.0;

    public static void main(String[] args) {
        System.out.println("Task8");
        double t, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите временной промежуток между вспышкой молнии и громом (секунд):");
        t = sc.nextDouble();
        s = t * V;
        System.out.println("Расстояние до места удара молнии: " + "метров");

        }
    }
}
