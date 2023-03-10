package STRIVER_SDE_SHEET.ARRAYS_1;

public class D1_set_matrix_zeroes
{
    public static void main ( String[] args ) {

        int arr[][] = { {1,2,3} , {4,0,6} , {7,8,9} };

        //-----------------------------------------------------------------------

        int n = arr.length;
        int m = arr[0].length;

        // jar cell zero asel tr tyach row ani column mark karanyasathi
        int row[] = new int[n];
        int col[] = new int[m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if( arr[i][j] ==0 )
                {
                   row[i]=1;
                   col[j]=1;
                }
            }
        }

        // row array traverse karun je marked rows ahet tyache sagle cell zero kele
        for (int i = 0; i < n; i++) {
            if( row[i]==1 )
            {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // col array traverse karun je marked col ahet tyache sagle cell zero kele
        for (int j = 0; j < m; j++) {
            if( col[j]==1 )
            {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = 0 ;
                }
            }
        }

        // printed the matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println( );
        }

    }
}

// tc : O( m*n )
// sc : O( max( m , n ) )


