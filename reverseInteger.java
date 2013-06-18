public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x == 0)
            return 0;
        int sign = x > 0 ? 1 : -1;
        int last = 0;
        x = Math.abs(x);
        long result = 0;
        while( x > 0 ) {
            int digit = x % 10;
            result = result * 10 + digit;
            x = x / 10;
        }
        if(result > Integer.MAX_VALUE)
            return sign * Integer.MAX_VALUE;
        else
            return sign * (int)result;
        
    }
}