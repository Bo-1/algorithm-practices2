public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x == 0)
            return 0;
        int sign = x > 0 ? 1 : -1;
        long result = 0;
        while(x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if(result > Integer.MAX_VALUE) {
            if(sign > 0)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }
        else
            return (int)result;
    }
}