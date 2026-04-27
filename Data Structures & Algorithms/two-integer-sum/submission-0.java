class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* here we need to take map & for each value we need to find
        that if (target - current value) exist in map then return 
        the current index & corresponding index. In this way, TC can
        reduce other wise it is O(n^2) */
        Map<Integer, Integer> map = new HashMap<>();
        // value --> Index 
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
