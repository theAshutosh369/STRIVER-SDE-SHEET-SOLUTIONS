package STRIVER_SDE_SHEET.ARRAYS_4;

import java.util.HashMap;
import java.util.Map;

public class D1_two_sum {

    public static void main ( String[] args ) {

        int nums[] = {2,6,5,8,11};
        int target = 14 ;

        int ans[] = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for( int i = 0 ; i<nums.length ; i++ )
        {
            int k = target - nums[i];
            if( mp.containsKey( k )  )
            {
                ans[0] = i ;
                ans[1] = mp.get( k );
                System.out.println("Indexes : "+ ans[0] + " " + ans[1] );
            }
            mp.put( nums[i] , i );
        }


    }
}

// tc : O( n )     sc : O( n )
