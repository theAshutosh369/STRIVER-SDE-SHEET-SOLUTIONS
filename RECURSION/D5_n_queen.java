package STRIVER_SDE_SHEET.RECURSION;

public class D5_n_queen {


    static boolean check( int r , int c  , int[][] b )
    {
        for (int i = 0; i < c; i++) {
            if( b[r][i] ==1 ) return false;
        }

        for (int i = r ,j=c ; i >= 0 && j >= 0 ; i-- , j-- ) {
            if( b[i][j] ==1 ) return false;
        }

        for (int i = r , j=c ; j >= 0 && i < b.length ; i++ , j-- ) {
            if( b[i][j] ==1 ) return false;
        }

        return true;
    }
    static boolean solve( int c , int[][] b , int n )
    {
        if( c==n ) {
            print(b);
        }

        for (int r = 0; r < n; r++) {
            if( check( r , c , b ) )
            {
                b[r][c] = 1 ;
                solve( c+1 , b , n );
                b[r][c]= 0 ;
            }
        }

        return false;
    }
    static void print( int[][] b)
    {
        int n= b.length;
        for( int i =0 ; i<n ; i++ )
        {
            for (int j = 0; j < n; j++) {
                System.out.print( b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( );
    }
    public static void main ( String[] args ) {

        int n = 5 ;
        int[][] b = new int[n][n];

        solve( 0 , b , n  );






    }
}
