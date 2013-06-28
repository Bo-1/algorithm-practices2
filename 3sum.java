public class Solution {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3)
            return result;
        Arrays.sort(num);
        for(int i = 0; i < num.length - 2 && num[i] <= 0; i++) {
            if(i > 0 && num[i] == num[i - 1])
                continue;
            int j = i + 1;
            int k = num.length - 1;
            while(j < k) {
                int sum = num[j] + num[k] + num[i];
                if(sum < 0) {
                    do{
                        j++;
                    }
                    while(j < k && num[j] == num[j-1]);
                }
                else if(sum > 0) {
                    do
                        k--;
                    while(j < k && num[k] == num[k+ 1]);    
                }
                else{
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    res.add(num[i]);
                    res.add(num[j]);
                    res.add(num[k]);
                    result.add(res);
                    do{
                        j++;
                    }
                    while(j < k && num[j] == num[j-1]);
                    do{
                        k--;
                    }
                    while(k > j && num[k] == num[k + 1]);
                }
            }
        }
        return result;
    }
}