class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int dup=x;
        while(x>0){
            
            revNum= (revNum*10)+ x%10;
            x=x/10;
        }
        if(revNum==dup) return true;
        else return false;
    }
}