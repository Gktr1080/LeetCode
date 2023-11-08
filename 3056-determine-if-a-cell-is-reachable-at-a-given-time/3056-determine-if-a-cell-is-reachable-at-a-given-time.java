class Solution {
    public boolean isReachableAtTime(int x, int y, int a, int b, int t) {
         if(x == a && y == b ){
            if(t == 1) return false;
        }
        int p = x- a;
        int q = y- b;
        
        if(p<0){
            p = -p;
        }
        if(q<0) {
            q = -q;
        }
        
        int anst = Math.max(p,q);
        
        if(anst<= t) return true;
        
        
        return false;
    }
}