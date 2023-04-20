package STRIVER_SDE_SHEET.ARRAYS_3;

public class D2_implementation_of_pow_x_raiseTo_n {



    public static void main ( String[] args ) {
        int x = 2 , n = 10;

        long k = n;
        if( n<0 ) k = -1*k;
        double ans = 1.0;

        while( k>0 )
        {
            if( k%2==1 ){
                ans = ans*x ;
                k--;
            }
            else {
                x = x*x ;
                k = k/2 ;
            }
        }

        System.out.println( ans );
        if( n<0 ) System.out.println( 1.0 / (double)ans );
        else System.out.println( ans );




    }
}
