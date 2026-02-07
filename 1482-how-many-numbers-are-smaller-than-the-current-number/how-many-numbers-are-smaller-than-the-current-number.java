class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                
            if(nums[i]>nums[j]) {
                s++;
            }
            a[i] = s; 
            }      
        }

        return a;
    }
}

  