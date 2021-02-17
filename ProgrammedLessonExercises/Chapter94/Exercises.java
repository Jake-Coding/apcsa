public class Exercises {
    public static void main(String[] args) {
        System.out.println(ex1Count("XaaaYaaaZaaaYaaaaY", 'Y')); // 3
        System.out.println(ex6Palindrome("aboba")); // t
        System.out.println(ex6Palindrome("notbob")); // f
        System.out.println(ex3MatchIgnoreQuestionMark("MOON", "M??N")); //t
        System.out.println(ex3MatchIgnoreQuestionMark("MOON", "MA?N")); //f
        System.out.println(ex3MatchIgnoreQuestionMark("?????hello", "test1?????")); // t

        
    }

    public static int ex1Count(String s, char i) {
        if (s.length() == 0) return 0;
        if (s.charAt(0) == i) {
            return 1 + ex1Count(s.substring(1), i);
        }
        return ex1Count(s.substring(1), i);
    }

    public static boolean ex3MatchIgnoreQuestionMark(String a, String b) {
        if (a.length() != b.length()) return false;
        if (a.length() == 0) return true;
        if (a.charAt(0) == '?' || b.charAt(0) == '?' || a.charAt(0) == b.charAt(0)) {
            return ex3MatchIgnoreQuestionMark(a.substring(1), b.substring(1));
        }
        return false;
    }

    public static boolean ex6Palindrome(String s) {
        if (s.length() <= 1) return true;
        return s.charAt(0) == s.charAt(s.length()-1) && ex6Palindrome(s.substring(1, s.length()-1));
    }
}