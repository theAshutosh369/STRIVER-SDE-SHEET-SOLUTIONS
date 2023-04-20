package STRIVER_SDE_SHEET.ARRAYS_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class D2_Merge_Overlapping_Subintervals {


    public static void main ( String[] args ) {

        int arr[][] = {{1,3},{2,6},{8,10},{15,18}} ;

        int n = arr.length;

        List< int[] > res = new LinkedList<>();

        // Sorted the array
        Arrays.sort( arr , ( x , y) -> x[0]-y[0]);

        int st = arr[0][0];
        int end = arr[0][1];

        for( int i = 1 ; i<n ; i++ )
        {
            // if 1st element lies inside the interval update the end
            if( arr[i][0]<=end ){
                end = Math.max( end , arr[i][1] );
            }
            else{
                // else add into the final array list
                res.add( new int[]{ st , end });
                st = arr[i][0];
                end = arr[i][1];
            }
        }
        res.add( new int[]{ st , end });


        for (int i = 0; i < res.size(); i++) {
            System.out.print(" [ " + res.get(i)[0] + " , " + res.get(i)[1] + " ] ");
            System.out.println();
        }


    }
}
