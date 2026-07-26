class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long res = (long) n * (n + 1)/2;
        long sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
        }
        //if(ans == 0){
          //  return -1;
        //}
        return (int) (res - sum);
    }
}