package leetcode.medium.q0003;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
	  //使用sliding window 來解決問題
	  public int lengthOfLongestSubstring(String s) {
		  int right = 0;
          int left = 0;
          int maxLength = 0;

          HashSet<Character> chars = new HashSet<>();

          while(right < s.length()) {
              if(!chars.contains(s.charAt(right))) {
                  chars.add(s.charAt(right));

                  maxLength = Math.max(maxLength, chars.size());
                  right++;
              }else {
                  left++;
                  right = left;

                  chars.clear();
              }
          }
          return maxLength;
	    }
}
