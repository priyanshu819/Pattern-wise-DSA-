public class e_stock_bye_Sell {
    public static void main(String[] args) {
        //int[] arr={7,1,5,3,6,4};
        //int[] arr={7,6,4,3,1};
        int[] arr={2,4,1};
        int ans=maxProfit(arr);
        System.out.println("o/p: "+ans);
    }
    //arr={7,1,5,3,6,4};  o/p=6
    //arr={7,6,4,3,1};    o/p=0
    //arr={2,4,1}         o/p:2
    static int maxProfit(int[] prices){
          int buy=prices[0],sell=prices[0],ind1=0,ind2=0;
          for(int i=1; i<prices.length; i++){
            if(prices[i]<buy){
                buy=prices[i];
                ind1=i;
            }
            if(ind1>ind2){
                 ind2=ind1;
                 sell=buy;
                }
            if(prices[i]>sell && i>ind1){
                sell=prices[i];
                ind2=i;
            }
          }
          System.out.println(ind1+" "+ind2);
          if(ind1<ind2)
            return sell-buy;
          else return 0;
    }
}
