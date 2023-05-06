package STRIVER_SDE_SHEET.ARRAYS_4;

import java.util.*;

public class D2_4_sum {


    public static void main ( String[] args ) {

        int arr[] = { 1,0,-1,0,-2,2 };
        int sum = 0 ;
        // ----------------------------------------------------

        int n = arr.length;
        Set< ArrayList<Integer>> ans = new HashSet<>();


        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int rem = sum - arr[i] - arr[j] - arr[k] ;
                    if( Arrays.binarySearch( arr , k+1 , n , rem )>=0  )
                    {
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add( arr[i] );
                        t.add( arr[j] );
                        t.add( arr[k] );
                        t.add( rem );

                        Collections.sort( t );
                        ans.add( t );
                    }
                }
            }
        }
        System.out.println( ans );



    }
}
