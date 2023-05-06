package STRIVER_SDE_SHEET.ARRAYS_2;

public class D4_count_inversions {

    static long merge( long arr[] , long temp[] , int l , int mid , int r )
    {
        int i = l , j = mid , k = l ;
        int c = 0 ;

        while( i<mid && j<=r )
        {
            if( arr[i]<=arr[j] )
            {
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                c += mid-i ;
            }
        }

        while( i<mid ) temp[k++] = arr[i++];
        while( j<=r )  temp[k++] = arr[j++];

        for( i = l ; i<= r ; i++  ) arr[i] = temp[i];

        return c ;
    }

    static long f( long arr[] , long temp[] , int l , int r )
    {
        int c=0;
        if( r>l )
        {
            int mid = (r+l)/2;

            c += f( arr , temp , l , mid );
            c += f( arr , temp , mid+1 , r );

            c += merge( arr , temp , l , mid+1 , r );
        }

        return c;
    }

    public static void main ( String[] args ) {

        long arr[] = { 2 ,5, 1, 3 ,4 };
        int n = arr.length;

        long temp[] = new long[n];
        System.out.println( f( arr , temp , 0 , n-1 )  );


    }
}
