class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> count = new HashMap<>();
        int val = 0;

        for(int i=0; i<nums.length; i++){
            val = target - nums[i];
            if(count.containsKey(val)){
                return new int[]{count.get(val),i};
            }
            count.put(nums[i],i);

        }
        return new int[]{};
    }
}
