class Solution {
    public boolean isPowerOfTwo(int n) {
        int s=0;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
        if(n==1){
           return true;
        }
    
        if(Math.pow(2,mid)==n){
            return true;
        }
        else if(Math.pow(2,mid)<n){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        
        }
        
        
        return false;
        
    }
}