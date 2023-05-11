package STRIVER_SDE_SHEET.RECURSION;

import java.util.ArrayList;

public class D4_all_permutations_of_array {

    static void swap( int a , int b , int[] arr )
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t ;
    }


    static void f( int ind , int[] arr , int n , ArrayList<ArrayList<Integer>> ans  )
    {

        if( ind==n )
        {
            ArrayList<Integer> t = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                t.add( arr[i] );
            }
            ans.add( t );
            return;
        }

        for( int i = ind ; i<n ; i++  )
        {
            swap( i ,ind , arr );
            f( ind+1  , arr , n , ans );
            swap( i , ind , arr );
        }
    }

    public static void main ( String[] args ) {

        int arr[] = { 1 ,2 , 3 };
        int n  = arr.length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        f( 0 , arr , n , ans );
        System.out.println(  ans );



    }
}
