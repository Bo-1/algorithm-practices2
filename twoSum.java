public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] results = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++) {
            hm.put(numbers[i], i + 1);
        }
        for(int i = 0; i < numbers.length; i++) {
            if(hm.containsKey(target - numbers[i])) {
                results[0] = i + 1;
                results[1] = hm.get(target - numbers[i]);
                break;
            }
        }
        return results;
    }
}