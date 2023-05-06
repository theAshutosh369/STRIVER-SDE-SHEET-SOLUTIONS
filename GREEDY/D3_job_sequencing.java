package STRIVER_SDE_SHEET.GREEDY;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class D3_job_sequencing {
    static class job{
        int id , deadline , profit ;
        job( int id , int d , int p )
        {
            this.id = id ;
            this.deadline = d ;
            this.profit = p ;
        }

    }
    public static void main ( String[] args ) {

        Scanner s = new Scanner(System.in );
        int n  = 5 ;
        job[] arr = new job[5];
        for (int i = 0; i < n; i++) {
            int id = s.nextInt();
            int d = s.nextInt();
            int pr = s.nextInt();
            arr[i] = new job(  id , d, pr );
        }
        Map<Integer , Integer> mp = new HashMap<>();
        for( int i = 0 ; i<n ; i++ )
        {
            int t = arr[i].deadline ;
            if( mp.containsKey(t ) )
            {
                mp.put( t , Math.max( arr[i].profit , mp.get(t) ));
            }else mp.put( t , arr[i].profit );
        }


        System.out.println( mp );
        int ans = 0 ;
        for( Map.Entry<Integer, Integer> e : mp.entrySet() )
        {
            ans += e.getValue();
        }

        int res[] = new int[2];
        res[0] = mp.size();
        res[1] = ans ;
        System.out.println( Arrays.toString( res ) );

    }
}
