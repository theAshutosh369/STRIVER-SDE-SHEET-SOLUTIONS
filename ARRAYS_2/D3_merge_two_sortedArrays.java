package STRIVER_SDE_SHEET.ARRAYS_2;

public class D3_merge_two_sortedArrays {

    public static void main ( String[] args ) {

        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3,  n = 3 ;

        int p1 = m-1 , p2 = n-1 , i = m+n-1;

        while( p2>=0)
        {
            if( p1>=0 && nums1[p1]>=nums2[p2])
            {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
            else{
                nums1[i] = nums2[p2];
                i-- ;
                p2--;
            }
        }


        for (int j = 0; j < m + n; j++) {
            System.out.print( nums1[j] + " ");
        }



    }
}
