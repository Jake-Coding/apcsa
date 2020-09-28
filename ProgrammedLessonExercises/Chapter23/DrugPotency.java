public class DrugPotency {
    public static void main(String[] args) {
        final double loss = 0.04;
        final double multiplier = 1-loss;
        int month = 0;
        double effectiveness = 100; // initial effectiveness
        while (effectiveness > 50) {
            System.out.println("Month: " + month + "\tEffectiveness: " + effectiveness);
            month++;
            effectiveness *= multiplier;
            
        }
        System.out.println("Month: "+month+ "\tDISCARD");
    }
}