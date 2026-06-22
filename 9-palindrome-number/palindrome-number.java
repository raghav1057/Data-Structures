class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;

        if(x<0){
            return false;
        }

        while(n!=0){
            int a = n%10;
            n = n/10;
            
            rev = rev*10 + a;
        }
        
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
}