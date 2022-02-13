public class LearnMain {
    public static void main(String[] args) {
        digital_root(456);
    }

    public static int digital_root(int n) {
        int sumnamber = 0;
        while (n > 0) {
            sumnamber = sumnamber + n % 10;
            n = n / 10;
        }
        n = sumnamber;
        if (sumnamber / 10 > 0){
            digital_root(n);
        }

        return n;
    }
}
