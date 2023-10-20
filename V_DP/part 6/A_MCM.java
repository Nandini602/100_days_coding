
import java.util.*;

public class A_MCM{
    public static int mcm(int arr[],int i , int j){
        if(i == j){
            return 0; // single matrix case
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k); //arr[i-1]xarr[k]
            int cost2 = mcm(arr,k+1,j); //arr[k]xzrr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans; //mincost
    } 

    public static void main(String agrs[]){
        int arr[] = {1,2,3,4,3};
        int n = arr.length;

        System.out.println(mcm(arr,1,n-1));
    }
}