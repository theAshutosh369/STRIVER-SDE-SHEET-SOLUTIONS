package STRIVER_SDE_SHEET.ARRAYS_2;


import java.util.Arrays;

public class D3_merge_two_sortedArrays {

    public static void main ( String[] args ) {

//        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
//        int m = 3,  n = 3 ;
//
//        int p1 = m-1 , p2 = n-1 , i = m+n-1;
//
//        while( p2>=0)
//        {
//            if( p1>=0 && nums1[p1]>=nums2[p2])
//            {
//                nums1[i] = nums1[p1];
//                i--;
//                p1--;
//            }
//            else{
//                nums1[i] = nums2[p2];
//                i-- ;
//                p2--;
//            }
//        }
//
//
//        for (int j = 0; j < m + n; j++) {
//            System.out.print( nums1[j] + " ");
//        }



        // sorting without using extra space
        int a1[] = { 1 ,3 ,5 ,7 };
        int n = a1.length;
        int a2[] = { 0 , 2 , 6 , 8 , 9 };
        int m = a2.length;

        for (int i = 0; i < n; i++) {

            if( a1[i]>a2[0])
            {
                int t = a1[i];
                a1[i] = a2[0];
                a2[0] =  t;
            }

            Arrays.sort( a2 );

        }

        System.out.println( Arrays.toString( a1 ));
        System.out.println( Arrays.toString( a2 ));



    }
}
