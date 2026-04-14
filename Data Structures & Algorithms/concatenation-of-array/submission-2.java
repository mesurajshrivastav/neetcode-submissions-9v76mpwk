class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length*2;

        int []arr = new int[n];
        int k= 0;
        for(int i=0; i<2; i++){
            for(int num : nums){
                arr[k++] = num; 
            }
        }

        return arr;
        
    }
}