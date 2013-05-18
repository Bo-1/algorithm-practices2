public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return binarySearch(A, target, 0, A.length - 1);
    }
    
    public int binarySearch(int[] A, int target, int start, int end) {
            if(start <= end) {
                int mid = start + (end - start) / 2;
                if(target == A[mid])
                    return mid;
                else if(A[mid] > target)
                    return binarySearch(A, target, start, mid - 1);
                else
                    return binarySearch(A, target, mid + 1, end);
            }
            else
                return start;
    }
}