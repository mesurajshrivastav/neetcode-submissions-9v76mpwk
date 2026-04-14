class Solution {
    public int findMax(int count, int max){
            if(count>max){
                return count;
            }
            return max;
        }
    public int findMaxConsecutiveOnes(int[] nums) {

       

        int count = 0;
        int n = nums.length;
        int max = 0;

        for(int i=0; i<=n-1; i++){
            if(nums[i] == 1){
                count++;
            }else {
               max = findMax(count,max);
               count = 0;
            }
        }
       max =  findMax(count,max);
        return max;
    }
}