public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] roman = s.toCharArray();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int l = roman.length;
        int sum = map.get(roman[l - 1]);
        for(int i = l - 2; i >= 0; i--) {
            if(map.get(roman[i]) >= map.get(roman[i + 1]))
                sum += map.get(roman[i]);
            else
                sum -= map.get(roman[i]);
        }
        return sum;
    }
}