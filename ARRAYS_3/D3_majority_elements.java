package STRIVER_SDE_SHEET.ARRAYS_3;

import java.util.HashMap;
import java.util.Map;

public class D3_majority_elements {
    public static void main ( String[] args )
    {


        int arr[] = {2,2,1,1,1,2,2};
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            int k = arr[i];
            mp.put( k , mp.getOrDefault( k, 0 )+1 );
        }

        int max = 0;
        int ans =0;
        System.out.println( mp );
        for( Map.Entry<Integer,Integer> e : mp.entrySet())
        {
            if( e.getValue()>max ) {
                max = e.getValue();
                ans = e.getKey();
            }
        }

        System.out.println( ans );


    }
}
