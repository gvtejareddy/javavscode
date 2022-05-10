package leetcode;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {


        String longestSubString ="";
        int lengthOfString=0;

        for( int i=0; i<=s.length();i++){

            for( int j=0; i<s.length();j++){
                if(!(s.charAt(j) == s.charAt(j+1))){
                    longestSubString = longestSubString.concat(Character.toString(s.charAt(j)));
                }
            }

        }

        return lengthOfString;
        
    }
}
// abcabccc