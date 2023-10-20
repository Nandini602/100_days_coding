//mcm using the memoization 

import java.util.*;

public class B_MCM{

    public static int mcmmemo(int arr[],int i, int j , int dp[][]){
        if(i == j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        } 

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcmmemo(arr,i,k,dp);
            int cost2 = mcmmemo(arr,k+1,j,dp);
            int cost3 = arr[i-1]*arr[k]*arr[k]*arr[j];
            ans = Math.min(ans,cost1+cost2+cost3);

        } 
        return dp[i][j] = ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,3}; //n =5 
        int n = arr.length;

        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        } 

        System.out.println(mcmmemo(arr,i,n-1,dp));
    }
}