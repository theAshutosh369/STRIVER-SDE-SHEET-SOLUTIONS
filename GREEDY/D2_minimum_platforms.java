package STRIVER_SDE_SHEET.GREEDY;

import java.util.Arrays;
import java.util.Comparator;

public class D2_minimum_platforms {

    static class pair{
        int a , d ;
        pair( int a , int d )
        {
            this.a = a ;
            this.d = d ;
        }
    }

    static void sort( pair[] p )
    {
        Comparator<pair> c = new Comparator<pair>() {
            @Override
            public int compare ( pair o1, pair o2 ) {
                return o1.a - o2.a ;
            }
        };

        Arrays.sort( p , c);

    }
    public static void main ( String[] args )
    {

        int arr[] = {900, 940 , 950 , 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int n = arr.length;
        pair[] p = new pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new pair( arr[i] , dep[i] );
        }
        sort( p );

        for (int i = 0; i < n; i++) {
            System.out.print( p[i].a +" "  );
        }
        System.out.println( );
        for (int i = 0; i < n; i++) {
            System.out.print( p[i].d +" ");
        }
        System.out.println();

        int ans = 0 ;
        int end = 100000000;
        for (int i = 0; i < n; i++) {
            if( p[i].a < end ){
                ans++;
            }
            end = p[i].d;
            System.out.println( end );
        }

        System.out.println( ans );



    }
}
