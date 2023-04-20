package STRIVER_SDE_SHEET.ARRAYS_2;

public class D2_rotate_image {

    public static void main ( String[] args ) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m =  arr[0].length;


        // transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int a = arr[i][j];
                int b = arr[j][i];
                int temp = a;
                a=b;
                b=temp;

                arr[i][j] = a;
                arr[j][i] = b ;
            }
        }


        // reversing all the rows of trasnpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2; j++) {
                int a = arr[i][j];
                int b = arr[i][m-1-j];
                int temp = a;
                a=b;
                b=temp;

                arr[i][j] = a;
                arr[i][m-1-j] = b ;
            }
        }

        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
