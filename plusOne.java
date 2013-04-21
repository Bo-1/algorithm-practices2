public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (digits.length  == 0 || digits == null)
            return null;
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] / 10 == 1) {
                digits[i] = digits[i] % 10;
                carry = 1;
            }
            else {
                carry = 0;
                break;
            }
        }
        if (carry == 1) {
            int[] newdigits = new int[digits.length + 1];
            newdigits[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                newdigits[i] = digits[i-1];
            }
            digits = newdigits;
        }
        return digits;
        
    }
}