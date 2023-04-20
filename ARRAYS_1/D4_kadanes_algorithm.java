package STRIVER_SDE_SHEET.ARRAYS_1;

public class D4_kadanes_algorithm {

    static int kadanes_algo( int[] arr , int n)
    {
        int maxi = Integer.MIN_VALUE;
        int sum = 0 ;

        for (int i = 0; i < n; i++) {
            sum += arr[i] ;

            if( sum > maxi ) maxi = sum ;

            if( sum<0 ) sum = 0 ;
        }
        return maxi ;
    }
    public static void main ( String[] args ) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;

        System.out.println("Maximum sum subarray is : " + kadanes_algo( arr ,  n ));



    }
}
