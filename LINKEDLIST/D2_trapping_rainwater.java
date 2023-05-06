package STRIVER_SDE_SHEET.LINKEDLIST;

public class D2_trapping_rainwater {

    public static void main ( String[] args ) {
        int h[] = { 0,1,0,2,1,0,1,3,2,1,2,1};

        int n = h.length;

        int[] l = new int[n];
        int[] r = new int[n];

        int maxi = h[0];
        for( int i = 0 ; i<n ; i++ )
        {
            maxi = Math.max( maxi , h[i]);
            l[i] = maxi ;
        }

        maxi = h[n-1];
        for( int i = n-1 ; i>=0 ; i-- )
        {
            maxi = Math.max( maxi , h[i]);
            r[i] = maxi ;
        }

        int ans = 0 ;
        for( int i = 0 ; i<n ; i++ )
        {
            int t = Math.min( l[i] , r[i]);
            if( t> h[i] ) ans += t - h[i ];


        }

        System.out.println( ans );
    }
}
