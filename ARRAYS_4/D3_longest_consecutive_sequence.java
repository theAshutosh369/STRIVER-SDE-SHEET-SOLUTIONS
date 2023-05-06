package STRIVER_SDE_SHEET.ARRAYS_4;

import java.util.HashSet;
import java.util.Set;

public class D3_longest_consecutive_sequence {

    public static void main ( String[] args ) {

        int arr[]={100,200,1,2,3,4};
        // -----------------------------------

        int n = arr.length;
        int maxi = 0;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add( arr[i ]);
        }
        for (int i = 1; i < n; i++) {
            if( !st.contains( arr[i]-1 ) )
            {
                int t = 0 ;
                int cur = arr[i];
                while ( st.contains(cur)  )
                {
                    t++;
                    cur++;
                }
                maxi = Math.max( maxi , t );
            }
            else {
                st.add( arr[i] );
            }
        }

        System.out.println("Longest sequence : "+  maxi );

    }
}
