class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length; 
        int[] a = new int[n];
        int s = 0;
        for(int i = 0; i<n; i++){
            s+=nums[i];
           a[i]=s;
            
            
        }
        return a;
        
    }
}