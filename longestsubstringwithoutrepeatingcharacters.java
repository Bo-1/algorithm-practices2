public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //better to convert to char array
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0, max = 0;
        int j = 0;
        boolean[] table = new boolean[256];
        //use while instead of for, more flexible when change index
        while(j < n) {
            char c = chars[j];
            if(table[c]) {
                max = j - i > max ? j - i : max;
                //i always point to the character next to the repeated one
                //also need to remove the hitory from old i to new i 
                //new i + 1 's history doesn't need to remove, becoz j has same history
                while(chars[i] != chars[j]) {
                    table[chars[i]] = false;
                    i++;
                }
                i++;
                j++;
            }
            else {
                table[chars[j]] = true;
                j++;
            }
        }
        return max > n - i ? max : n - i;
    }
}