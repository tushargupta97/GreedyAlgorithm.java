import java.util.*;
public class StockPricesHW{
    public static int maxProfit(int price[]){
        int buyPrice=price[0];
        int mprofit=0;//Integer.MIN_VALUE;
        for(int i=1; i<price.length;i++){
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice;
                 mprofit=Math.max(profit, mprofit);

            }
            else{
                buyPrice=price[i];
            }

        }
        return mprofit;
    }

    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        System.out.println(maxProfit(price));
    }
}