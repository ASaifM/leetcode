public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < nums.length; i++)
            hm.put(nums[i], i);
        
        for (int i = 0; i < nums.length; i++){
            if (hm.get(target - nums[i]) != null){
                int j = hm.get(target - nums[i]).intValue();
                if (j == i)
                    continue;
                int [] ans = new int [2];
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            
        }    
         int [] ans = new int[2];
         ans [0] = ans[1] = -1;
         return ans;
    }
}