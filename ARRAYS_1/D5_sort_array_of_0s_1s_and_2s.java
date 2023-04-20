package STRIVER_SDE_SHEET.ARRAYS_1;

public class D5_sort_array_of_0s_1s_and_2s {

    public static void main ( String[] args ) {

        int nums[] = {2,0,2,1,1,0};
        //-----------------------------------------

        int r = 0 , w = 0 , b = 0 ;
        int n = nums.length;

        for( int i = 0 ; i<n ; i++ )
        {
            if( nums[i] == 0 ) r++;
            else if( nums[i] == 1 ) w++;
            else b++ ;
        }

        int i = 0;
        while( r>0 ) {
            nums[i]=0;
            i++;
            r--;
        }
        while( w>0 ) {
            nums[i]=1;
            i++;
            w--;
        }
        while( b>0 ) {
            nums[i]=2;
            i++;
            b--;
        }


        for (int j = 0; j < n; j++) {
            System.out.print( nums[j] + " ");
        }
        // we can use sort function too
    }
}
