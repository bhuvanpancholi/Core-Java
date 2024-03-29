public class ComplexPattern {
    public static void main(String[] args){
        int i, j;
        int n = 9;

        for (i=0 ; i<n ; i++ ){

            for(j=0 ; j<n ; j++){

                if (j == 0 || i == (n-1)/2 || i==j/2 || j==j/2)  {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            for(j=0 ; j<n ; j++){

                if (j==0 || i==(n-1)/2 || j==(n-1)) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            for(j=0 ; j<n ; j++){

                if (j==0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.print("       ");

            for(j=0 ; j<n ; j++){

                if ( j==0 || j == n-1 || (i-j == n/2) || i + j == n + n / 2 - 1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("       ");

            for(j=0 ; j<n ; j++){

                if (i == 0 ||j==0 || i == (n-1)/2 || j == n-1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.print("       ");

            for(j=0 ; j<n ; j++){

                if (j==0 || j == n-1 || i==j) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
