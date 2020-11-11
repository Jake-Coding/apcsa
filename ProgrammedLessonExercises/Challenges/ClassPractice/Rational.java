public class Rational {
    int numerator;
    int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
    }
    public int getNum() {return numerator;}
    public int getDenom() {return denominator;}
    public void printRational() {
        System.out.println(this);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void negate() {
        numerator *= -1;
    }

    public void invert() {
        int temp_denom = denominator;
        denominator = numerator;
        numerator = temp_denom;
    }

    public double toDouble() {
        return (double) numerator / (double) denominator;
    }

    private int gcd() {
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
    private int gcd(int a, int b) {
        if (a==0) {return b;}
        return gcd(b%a, a);

    }
    public void reduce() {
        int divisor = gcd();
        numerator /= divisor;
        denominator /= divisor;
    }
    public Rational add(Rational other) {
        Rational newRat = new Rational(this.numerator * other.getDenom() + other.getNum() * this.denominator, this.denominator * other.getDenom()); 
        newRat.reduce();
        return newRat;
    }
}