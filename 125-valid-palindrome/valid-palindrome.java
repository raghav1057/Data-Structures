class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length() - 1;

        while(left < right){
            //skip non alphabets from left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //same from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //direct compare with lowercase

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}