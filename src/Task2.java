public class Task2 {

    public static void main(String[] args) {
        System.out.println("Task2");
        int n = 254;
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int z5 = z % 10;
        int result = x + y + z5;
        System.out.println(result);
    }
}
