package hackerrank;

public class solone {

    public static void main(String[] args) {

        final String str = "aba";
        String finalStr = str;
        final long n = 1000000000;
        for (long i = 0; i <= n; i++) {
            if (finalStr.length() > n) {
                break;
            }
            for (int j = 0; j < str.length(); j++) {
                if (finalStr.length() < n) {
                    finalStr = finalStr + str.charAt(j);
                } else {
                    break;
                }
            }
        }

        System.out.println(countOccurrences(finalStr, 'a'));

    }

    private static long countOccurrences(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }
}
