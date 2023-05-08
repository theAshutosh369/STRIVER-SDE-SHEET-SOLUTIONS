package STRIVER_SDE_SHEET.RECURSION;

import java.util.ArrayList;

public class D1_combination_sum {

    static void f( int i , int target ,  ArrayList<Integer> t  , ArrayList<ArrayList<Integer> > ans   , int[] arr , int n   )
    {
        if( i==n )
        {
            if( target==0 )
            {
                ans.add( new ArrayList<>(t) );
            }
            return ;
        }

        if( arr[i]<=target )
        {
            t.add( arr[i] );
            f( i  , target-arr[i] , t , ans , arr , n );
            t.remove( t.size()-1 );
        }
        f( i+1 , target , t , ans , arr , n );

    }

    public static void main ( String[] args ) {

        int[] arr = { 2,3,6,7 };
        int target = 7 ;
        int n = arr.length;


        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();

        f( 0 , target , t , ans , arr , n );

        System.out.println( ans );

    }
}
