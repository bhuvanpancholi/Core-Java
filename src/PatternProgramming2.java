public class PatternProgramming2 {
    public static void main(String[] args){
        int i, j;
        int n = 9;

        for (i=0 ; i<n ; i++ ){

            for(j=0 ; j<n ; j++){

                if (j==0 || i-j==(n-1)/2 || i+j==(n-1)/2) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            for(j=0 ; j<n ; j++){

                if (i == 0 ||j==0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
