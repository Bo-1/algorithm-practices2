public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //assumming height[i] < height[j], then if we move j to the left,
        //the maxArea can only be smaller, because height[i] is the bottleneck
        if(height.length <= 1)
            return 0;
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if(height[i] < height[j]) 
                i++;
            else
                j--;
        }
        return maxArea;
    }
}