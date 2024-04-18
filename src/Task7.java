public class Task7 {
    public static final int YEAR_PERCENT = 10;
    public static void main(String[] args) {
        System.out.println("Task7");
        int money = 1000;
        int itg = money + ((money * YEAR_PERCENT) * 2) / 100;
        System.out.println(itg);
    }
}
