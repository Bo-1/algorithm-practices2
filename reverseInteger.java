public class Solution {
    public int reverse(int x) {
        if(x == 0)
            return 0;
        int sign = x > 0 ? 1 : -1;
        int base = 10;
        int[] digits = new int[10];
        int last = 0;
        x = Math.abs(x);
        for(int i = 9; i >= 0; i--) {
            digits[i] = (x % base - last) * 10 / base;
            last = x % base;
            base *= 10;
        }
        int i = 0;
        while(digits[i] == 0)
            i++;
        long result = 0;
        for(int j = i; j < 10; j++) {
            result += digits[j] * Math.pow(10, j - i);  
        }
        if(result > Integer.MAX_VALUE)
            return sign * Integer.MAX_VALUE;
        else
            return sign * (int)result;
        
    }
}