public class LunchTester {
    public static void main(String[] args) {
        LunchAccount[] lunchAccounts = new LunchAccount[101];
        for (int i = 0; i < 101; i++) {
            lunchAccounts[i] = new LunchAccount("ACCT"+i, 1);
        }
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $21 overall spent $0 no lunches bought
        System.out.println(lunchAccounts[100]); // ACCT100 ID 1100 $1 overall spent $0

        lunchAccounts[0].addMoney(30);
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $51 overall spent $0

        boolean gotLunch = lunchAccounts[100].getLunch(2);
        System.out.println(gotLunch); // false
        System.out.println(lunchAccounts[100]); // ACCT100 ID 1100 $1 overall spent $0


        gotLunch = lunchAccounts[0].getLunch(51);
        System.out.println(gotLunch); // true
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $51 overall spent $51 1 lunch bought.

        lunchAccounts[0].addMoney(30);
        lunchAccounts[0].getLunch(25);
        System.out.println(lunchAccounts[0]); // Acct0 ID 1000 $76 overall 2 lunches bought
        



    }
}