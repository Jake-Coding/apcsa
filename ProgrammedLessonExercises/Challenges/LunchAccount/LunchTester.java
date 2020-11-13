public class LunchTester {
    public static void main(String[] args) {
        LunchAccount[] lunchAccounts = new LunchAccount[101];
        for (int i = 0; i < 101; i++) {
            lunchAccounts[i] = new LunchAccount("ACCT"+i, 1);
        }
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $21
        System.out.println(lunchAccounts[100]); // ACCT100 ID 1100 $1

        lunchAccounts[0].addMoney(30);
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $51

        boolean gotLunch = lunchAccounts[100].getLunch(2);
        System.out.println(gotLunch); // false
        System.out.println(lunchAccounts[100]); // ACCT100 ID 1100 $1


        gotLunch = lunchAccounts[0].getLunch(51);
        System.out.println(gotLunch); // true
        System.out.println(lunchAccounts[0]); // ACCT0 ID 1000 $0
        



    }
}