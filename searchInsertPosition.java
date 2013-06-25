public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0 ||  A == null)
            return -1;
        return binarySearch(A, target, 0, A.length - 1);
    }
    //user length - 1, return start
    public int binarySearch(int[] A, int target, int start, int end) {
        if(start > end)
            return start;
        int mid = start + (end - start)/ 2;
        if(A[mid] == target)
            return mid;
        else if(A[mid] < target)
            return binarySearch(A, target, mid + 1, end);
        else
            return binarySearch(A, target, start, mid - 1);
    }