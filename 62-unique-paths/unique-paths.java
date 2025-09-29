class Solution {
    public int rec(int[][] dp,int m,int n){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!= -1){
            return dp[m][n];
        }
        dp[m][n]=rec(dp,m-1,n)+rec(dp,m,n-1);
       return dp[m][n];

    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int [m][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return rec(dp,m-1,n-1);
    }
}