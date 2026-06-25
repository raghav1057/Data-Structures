class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = num;
        //ArrayList<Integer> div = new ArrayList<>();
        int sum = 0;

        for(int i = 1; i<=n/2; i++){
            if(num%i == 0){
                sum+=i;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
}