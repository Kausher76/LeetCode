class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // String str = "";
        // for(int i = s.length()-1; i >= 0; i--){
        //     str = str + s.charAt(i);
        // }
        // return s.equals(str);
        boolean ispalim = true;
        int low = 0;
        int high = s.length()-1;
        while(low <= high) {
            if(s.charAt(low) != s.charAt(high)) {
                ispalim = false;
            }
            low++;
            high--;
        }
        
        return ispalim;
 
    }
}