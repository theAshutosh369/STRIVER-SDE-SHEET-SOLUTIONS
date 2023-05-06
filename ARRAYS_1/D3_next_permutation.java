package STRIVER_SDE_SHEET.ARRAYS_1;

import java.util.Arrays;

public class D3_next_permutation {

    public static void main ( String[] args ) {


        int arr[] = { 1,1,5};

        int n = arr.length;

        // searching for the break point
        int ind = -1 ;
        for( int i = n-2 ; i>=0 ; i-- )
        {
            if( arr[i]< arr[i+1] )
            {
                ind = i ;
                break;
            }
        }

        for( int i = n-1 ; i>ind ; i-- )
        {
            // search for just greater element in array and swap it with arr[ind]
            if( ind!=-1 && arr[i]>arr[ind] )
            {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;

                break;
            }
            // if array is in reverse sorted
            else if( ind==-1 ){

                // reverse the array and return
                for( int k = 0 , j=n-1 ; k< n/2 ; k++ , j-- )
                {
                    int t = arr[k];
                    arr[k] = arr[j];
                    arr[j] = t ;
                }
                return;
            }
        }

        // sort the remaining part of array after arr[ind]
        Arrays.sort( arr , ind+1 , n);


        System.out.println(    Arrays.toString(arr)   );

    }
}


// tc : O( n )
// sc : O( 1 )