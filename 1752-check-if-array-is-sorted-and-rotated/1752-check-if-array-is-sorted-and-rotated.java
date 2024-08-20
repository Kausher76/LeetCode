class Solution {
    public boolean check(int[] nums) {
//         boolean isSorted = false;
        
//         for (int i = 0; i < nums.length - 1; i++) {
//             if ((nums[i] - nums[i + 1]) > 1 || (nums[i] - nums[i + 1]) < -1 || (nums[i] - nums[i + 1]) == (nums.length - 1) ) {
//                 isSorted = true;
//                 break;
//             }
//         }
        
//         return isSorted;
        
        
        int n = nums.length;
        int count = 0;
        
        // Check if the array is non-decreasing
        for (int i = 1; i < n; i++)
            if (nums[i - 1] > nums[i])
                count++;
        
        // Check if the last element is greater than the first element
        if (nums[n - 1] > nums[0])
            count++;
        
        // If the count of violations is less than or equal to 1, return true
        return count <= 1;
    }
}
