package STRIVER_SDE_SHEET.ARRAYS_4;

import java.util.HashMap;
import java.util.Map;

public class D4_longest_subarray_with_k_sum {
    public static void main ( String[] args ) {

        int arr[] = { 9, -3, 3, -1, 6, -5};
        int k = 0 ;
        // -------------------------------

        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0 , maxi = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if( sum ==k ) maxi = i+1 ;
            else{
                if( mp.containsKey(sum) )
                {
                    maxi = Math.max( maxi , i - mp.get(sum) );
                }
                else{
                    mp.put( sum , i );
                }

            }
        }


        System.out.println( maxi );




    }
}
