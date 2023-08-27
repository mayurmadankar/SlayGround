public class Solution {

    public static int[] countFrequency(int n, int x, int []nums){

        // Write your code here.
        if(nums==null || nums.length==0){
            return new int[n];
        }
        int ans[] = new int[n];
        
        for(int i=0 ; i<nums.length ;i++){
            if(nums[i]-1 < n){
                ans[nums[i]-1] = ans[nums[i]-1]+1;
            }
        }
        return ans;
    }

}