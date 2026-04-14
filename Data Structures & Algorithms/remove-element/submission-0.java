class Solution {
    public int removeElement(int[] nums, int val) {

    int n = nums.length;
    int count = 0;
        for(int num : nums){
            if(num == val){
                count++;
            }
        }      

    int []newArr = new int[n-count];

    int k = 0;
    for(int num : nums){
        if(num != val){
            newArr[k] = num;
            k++;
        }
    }
    
    for(int i=0; i<newArr.length; i++){
        nums[i] = newArr[i];

    }
    

    return newArr.length;

    }
}