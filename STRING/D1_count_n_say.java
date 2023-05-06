package STRIVER_SDE_SHEET.STRING;

public class D1_count_n_say {
    public static void main ( String[] args ) {

        int n = 9 ;
        String temp = "1";
        for( int i = 1 ; i< n ; i++ )
        {
            char ch = temp.charAt(0);
            String cur = "";
            int c = 1 ;
            for( int j = 1 ; j<temp.length() ; j++ )
            {
                if( temp.charAt(j)!=ch )
                {
                    cur += Integer.toString(c) + ch ;
                    ch = temp.charAt(j);
                    c= 1;
                }else{
                    c++;
                }
            }
            cur += Integer.toString(c) + ch ;
            ch = temp.charAt(temp.length()-1);
            temp = cur ;
        }

        System.out.println( temp );










    }
}
