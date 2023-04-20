package STRIVER_SDE_SHEET.ARRAYS_3;

public class D1_search_in_2d_matrix {

    public static void main ( String[] args ) {

        int mat[][] = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}} ;

        int m = mat.length , n = mat[0].length;
        int target = 3;

        //----------------------------------------------------

        int l = 0 , r = m*n-1;
        while( r>=l )
        {
            int mid = l+ (r-l)/2;

            int k = mat[mid/n][mid%n];

            if( k==target ) {
                System.out.println( "true" );
                return;
            }
            else if( k<target ) l=mid+1;
            else r = mid-1;
        }
        System.out.println( "false");


    }
}
