public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length < 2)
            return A.length;
        int tail = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i] != A[tail])
                A[++tail] = A[i];
        }
        return tail + 1;
    }
}