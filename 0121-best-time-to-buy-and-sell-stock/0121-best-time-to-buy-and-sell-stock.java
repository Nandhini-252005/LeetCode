class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mx=prices[0];
        int mn=prices[0];
        int p=0;
        for(int i=1;i<n;i++){
            if(prices[i]<mn){
                mn=prices[i];
                mx=mn;
            }
            if(prices[i]>mx){
                mx=prices[i];
            }
            if(mx-mn>p){
                p=mx-mn;
            }
        }
        return p;
    }
}