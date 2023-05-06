package STRIVER_SDE_SHEET.GREEDY;

import java.util.Arrays;
import java.util.Comparator;

public class D1_n_meetings_in_1_room
{
    static class pair{
        int st , end ;

        public pair(int x, int y) {
            this.st = x;
            this.end = y;
        }

    }

    static void sort(pair[] arr) {
        Comparator<pair> c = new Comparator<pair >() {
            @Override
            public int compare(pair p1, pair p2) {
                if( p1.end < p2.end ) return -1 ;
                return 1;
            }
        };
        Arrays.sort(arr, c);
    }


    public static void main(String[] args)
    {
        int s[] = {10, 12, 20};
        int e[] = {20, 25, 30};
        int n = s.length;


        pair p[] = new pair[n];

        for( int i = 0 ; i<n ; i++ )
        {
            p[i] = new pair( s[i] , e[i]  );
        }

        sort( p  );

        int st =0 , end = -1;
        int res= 0;
        for( int i = 0 ; i<n ; i++ )
        {
            if( p[i].st>end )
            {
                res++;
                st = p[i].st ;
                end = p[i].end;
            }
        }
        System.out.println( res );

    }
}
