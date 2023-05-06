package STRIVER_SDE_SHEET.LINKEDLIST;

import java.util.ArrayList;
import java.util.Arrays;

public class D1_3_sum {
    public static void main ( String[] args ) {

        int[] arr = { -1,0,1,2,-1,-4 };


        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort( arr );
        for( int i = 0 ; i<n-2 ; i++ )
        {

            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int l = i+1 , h = n-1 ;
                while( l<h )
                {
                    int cur = arr[i]+arr[l]+arr[h];
                    if( cur  == 0   )
                    {
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add( arr[i] );
                        t.add( arr[l] );
                        t.add( arr[h] );
                        ans.add( t );

                        while (l < h && arr[l] == arr[l + 1]) l++;
                        while (l < h && arr[h] == arr[h - 1]) h--;

                        l++;
                        h--;
                    }
                    else if( cur < 0 )
                    {
                        l++;
                    }else{
                        h--;
                    }

                }
            }
        }

        System.out.println( ans );
    }
}
