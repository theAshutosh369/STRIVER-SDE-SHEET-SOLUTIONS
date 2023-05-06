package STRIVER_SDE_SHEET.ARRAYS_1;

public class D6_stock_buy_and_sell
{

    public static void main ( String[] args )
    {

        int[] arr = { 7,1,5,3,6,4 };

        // -----------------------------------------------

        int n = arr.length ;

        int mini = arr[0];
        int maxprofit = 0 ;
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - mini ;
            maxprofit = Math.max( maxprofit , cost );
            mini = Math.min( arr[i] , mini );
        }

        System.out.println(" maximum profit will be : " + maxprofit );


    }
}
