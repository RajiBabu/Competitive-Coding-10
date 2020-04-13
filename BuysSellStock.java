// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No



public class BuysSellStock {
	
	
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0 )
            return 0;

        
        int maxProfit = 0;
        for(int i=0; i< prices.length-1; i++){
            
            
            if(prices[i+1] > prices[i]){
                maxProfit = maxProfit + ( prices[i+1] - prices[i]);
            }
        }
       return maxProfit; 
    }
    

	public static void main(String[] args) {
	
		BuysSellStock b = new BuysSellStock();
		int max = b.maxProfit(new int[] {2,3,5,6,7,9,3,5,6,8});
		System.out.println(max);
		

	}

}
