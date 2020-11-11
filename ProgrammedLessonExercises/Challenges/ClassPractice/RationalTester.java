public class RationalTester {
    public static void main(String[] args) {
        Rational one_half = new Rational(3,6);
        System.out.println(one_half); // 3/6
        one_half.negate();
        one_half.invert();
        Rational neg2 = one_half;
        System.out.println(neg2); // 6/-3
        neg2.reduce();
        System.out.println(neg2); // 2/-1
        Rational neg2half = neg2.add(new Rational(3,6));
        System.out.println(neg2half); // 3/-2
    }
}