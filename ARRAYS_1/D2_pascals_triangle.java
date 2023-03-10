package STRIVER_SDE_SHEET.ARRAYS_1;

import java.util.ArrayList;

public class D2_pascals_triangle {

    public static void main ( String[] args ) {

        int n = 6;
        //-----------------------------------

        ArrayList< ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);

//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1

        for (int i = 1; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            ArrayList<Integer> prev = arr.get(i-1);
            for (int j = 1; j < prev.size(); j++)
            {
                temp.add( prev.get(j-1)+prev.get(j) );
            }
            temp.add(1);
            arr.add( temp);
        }

        System.out.println( arr );

    }
}

// tc : O( n^2 )
// sc : O( n^2 )
