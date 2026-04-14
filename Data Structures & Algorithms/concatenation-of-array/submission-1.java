

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int arr[] = new int[n*2];
        int k = 0;

        for(int i =0; i<=1; i++){
            for(int num: nums){
                arr[k++] = num;
            }
        }

        return arr;
        
    }
}