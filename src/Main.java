public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 100;
        long bonus;
        long total;
        if (payment > 1000) {
            bonus = payment / 100;
            total = balance + payment + bonus;
            System.out.println(total);
        }
        if (payment < 1000) {
            bonus = 0;
            total = balance + payment;
            System.out.println(total);

        }
    }
}
