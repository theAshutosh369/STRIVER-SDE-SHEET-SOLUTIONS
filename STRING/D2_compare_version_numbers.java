package STRIVER_SDE_SHEET.STRING;

public class D2_compare_version_numbers {

    public static void main ( String[] args ) {

        String v1 = "1.0.1", v2 = "1";

        String t1[] = v1.split("\\.");
        String t2[] = v2.split("\\.");

        int n = Math.max( t1.length , t2.length );
        int a[] = new int[n];
        int b[] = new int[n];

        for( int i =0; i<t1.length ; i++ )
        {
            a[i]= Integer.parseInt( t1[i] );
        }
        for( int i =0; i<t2.length ; i++ )
        {
            b[i]= Integer.parseInt( t2[i] );
        }


        for( int i =0; i<n ; i++ )
        {
            if( a[i]<b[i] ) {
                System.out.println( -1 );
                return;
            }
            else if( a[i]>b[i] ) {
                System.out.println( 1 );
                return;
            }
        }
        System.out.println( 0 );




    }
}
