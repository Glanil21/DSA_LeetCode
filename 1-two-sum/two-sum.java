class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (h.containsKey(r)) {
                return new int[] { i, h.get(r) };
            }
            else{
                h.put(nums[i],i);
            }
            
        }
        return new int[2];
    }
}