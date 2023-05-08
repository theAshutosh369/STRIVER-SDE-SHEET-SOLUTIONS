package STRIVER_SDE_SHEET.RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D2_combination_sum_2 {
    static void f( int i , int target ,  List<Integer> t  ,  List<List<Integer>> ans   , int[] arr , int n   )
    {
        if( target==0 )
        {
            if( !ans.contains( t )) ans.add( new ArrayList<>(t) );
            return ;
        }


        for( int r = i ; r<arr.length ; r++ )
        {
            if( r>i && arr[r]==arr[r-1] ) continue ;
            if( arr[r]>target ) break ;

            t.add( arr[r] );
            f( r+1  , target-arr[r] , t , ans , arr , n );
            t.remove( t.size()-1 );

        }

    }

    public static void main ( String[] args ) {

        int[] arr = { 10,1,2,7,6,1,5 };
        int target = 8 ;

        int n = arr.length;

        Arrays.sort( arr );

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> t = new ArrayList<>();

        f( 0 , target , t , ans , arr , n );

        System.out.println( ans );
    }
}
