class Solution {
    public boolean hasDuplicate(int[] nums) {
        // we can use hashset instead of hashmap which reduces the time complexity from O(n^2) to O(n)..
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i<nums.length; i++){
                if(set.contains(nums[i])){
                    return true;
                    }
                set.add(nums[i]);
            }
            return false;
    }
}