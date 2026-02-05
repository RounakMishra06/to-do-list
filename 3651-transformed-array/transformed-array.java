class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
      for(int i=0;i<n;i++){
        int m= nums[i]%n;
        int newi = (i+m)%n;
        if(newi<0){
            newi += n;  
        }
        x[i]=nums[newi];
        
      
        
      }return x;

    }
}