public class P_stock { 

    public static int buysellstock(int prices[]){

        int buyprice = Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i = 0 ; i<prices.length;i++){
            if(buyprice < prices[i]){//profit
                int profit = prices[i] - buyprice;  
                maxprofit = Math.max(maxprofit , profit);
            } 
            else{
                buyprice = prices[i];
            }
        } 

        return maxprofit;
    }
    
    public static void main(String agrs[]){
        int prices[] = {7,1,5,3,6,4}; 

       System.out.println(buysellstock(prices));
    }
}
