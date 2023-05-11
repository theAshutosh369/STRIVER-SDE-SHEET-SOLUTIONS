package STRIVER_SDE_SHEET.RECURSION;

import java.awt.image.RasterOp;
import java.util.ArrayList;

public class D3_kth_permutation {
    public static void main ( String[] args ) {

        int n = 4  , k = 16 ;

        ArrayList<Integer> arr = new ArrayList<>();
        int f = 1 ;
        for(  int i = 1 ; i<n ; i++ )
        {
            f *= i ;
            arr.add( i );
        }
        arr.add( n );

        k = k-1 ;
        String ans = "";
        while( true )
        {
            ans += arr.get( k/f );
            arr.remove( k/f );

            if( arr.size()==0 ) break;

            k = k%f ;
            f = f/arr.size();
        }

        System.out.println( ans );


    }
}
