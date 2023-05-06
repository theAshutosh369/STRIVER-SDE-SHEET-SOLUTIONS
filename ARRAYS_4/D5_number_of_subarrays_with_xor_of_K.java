package STRIVER_SDE_SHEET.ARRAYS_4;


import java.util.HashMap;
import java.util.Map;

public class D5_number_of_subarrays_with_xor_of_K {
    public static void main ( String[] args )
    {
        int arr[] = { 4, 2, 2, 6, 4 };
        int k = 6;
        // ---------------------------------------------------

        int n = arr.length;

        Map<Integer,Integer> mp = new HashMap<>();
        int xor = 0 , c = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
            if( mp.containsKey( xor^k) ) c+= mp.get( xor^k );
            if( xor ==k ) c++;
            else
            {
                if( mp.containsKey(xor) )
                {
                    mp.put( xor , mp.getOrDefault( xor , 0 )+1);
                }
                else{
                    mp.put( xor , 1 );
                }
            }
        }

        System.out.println( c );


    }
}



