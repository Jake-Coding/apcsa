public class SheepHerd {
    public static void main(String[] args) {
        double n = 20;
        int t;
        double p = 0.83;
        int finalT = 0;
        for (t = 1; t < 25; t++) {
            n = 220/(1 + 10*p);
            p *= 0.83;
            if (n > 80) {
                finalT = t;
                break;
            }
            finalT = t;
        }
        System.out.print("N: " + n + "\nT: " + finalT);
    }
}