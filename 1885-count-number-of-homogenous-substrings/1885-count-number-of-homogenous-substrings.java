class Solution {
    public int countHomogenous(String s) {
        int i=0;
        int j=1;
        long count=0;
        int mod = (int)Math.pow(10,9)+7;
        long n;
        while(j<s.length()) {
            if(s.charAt(i)!=s.charAt(j)) {
            n = (j-i)%mod;
            int m = (int)((long)(n*(n+1))%mod);
            count = (count+(m/2))%mod;
            i=j;
            }
        
            j++;
        }
        n = (j-i)%mod;
        int m = (int)((long)(n*(n+1))%mod);
        count = (count+(m/2))%mod;
        return (int)count;
    }
}