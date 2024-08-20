class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum1 =  N*(N + 1) / 2;
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum = sum + nums[i];
        }
        int ret = sum1 - sum;  
        return ret;
    }
}