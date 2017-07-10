/*
 * 给定一个String，找出不带重复字母的最长子串。例如："abcdasd"，最长子串为"abcd"
 */
package test;

import java.util.HashMap;
import java.util.Map;

public class longestsubstring {
	public int lengthOfLongestSubstring(String s) {
		 if (s.length()==0) return 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max=0;
	        for (int i=0, j=0; i<s.length(); ++i){
	            if (map.containsKey(s.charAt(i))){
	                j = Math.max(j,map.get(s.charAt(i))+1);
	            }
	            map.put(s.charAt(i),i);
	            max = Math.max(max,i-j+1);
	        }
	        System.out.print(map);
	        return max;

	}

	public static void main(String[] args) {
		longestsubstring t = new longestsubstring();
		String s = "dvdflfjalfjdksf";
		t.lengthOfLongestSubstring(s);
	}
}
