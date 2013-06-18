public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[] digits = str.toCharArray();
        int n = digits.length;
        int i = 0;
        int sign = 1;
        while(i < n && digits[i] == ' ') 
            i++;
        if(i == n)
            return 0;
        if(digits[i] == '+' || digits[i] == '-') {
            sign = digits[i] == '-' ? -1 : 1;
            i++;
        }
        long result = 0;
        for(; i < n; i++) {
            if(digits[i] < '0' || digits[i] > '9')
                break;
            result = result * 10 + (digits[i] - '0');
        }
        result = result * sign;
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int)result;
    }
}