package leetcode;
import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String[] sml = findsmallestString(strs);

        String lcp = "";
        Boolean foundLcp =true;
        for(int i=0; i<=sml[0].length();i++){ //ab 2 
            String testableString = sml[0].substring(0,sml[0].length()-i);
            System.out.println(testableString);
            foundLcp=true;
            for( int j=0 ; j<sml.length;j++){
                if(sml[j].startsWith(testableString) && foundLcp){
                    lcp = testableString;
                    foundLcp=true;
                }
                else{
                    lcp="";
                    foundLcp=false;
                }

            }

            if(foundLcp){
                break;
            }

        }

        return lcp;
    }

    public static void main(String[] args) {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] testableStringArray = { "ab","b"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(testableStringArray));

    
    }

    public String[] findsmallestString(String[] testableStringArray) {

        Arrays.sort(testableStringArray, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return testableStringArray;
    }

}
