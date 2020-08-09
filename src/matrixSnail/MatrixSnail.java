package matrixSnail;

import java.util.Scanner;

public class MatrixSnail {

    static int score = 0 ;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        int[][] A = new int[n][n] ;

        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++)
                A[i][j] = scanner.nextInt() ;

        snailIterate(A,n);

        System.out.println(score);

    }

    static void snailIterate(int[][] A , int n){
        int sum = 0 ;

        int k= 0 ;
        while(n-2*k-1>=0){

            int r=k;
            int c=k;
            int d=n - 2*k - 1;

            if(d==0){
                sum+=A[r][c];
                check(sum);
            }
            for(int j=c;j<c + d;j++){
                sum+=A[r][j];
                check(sum);
            }
            for(int i=r;i<r + d;i++){
                sum+=A[i][c + d];
                check(sum);
            }
            for(int j=c + d;j>c;j--){
                sum+=A[r + d][j];
                check(sum);
            }
            for(int i=r + d;i>r;i--){
                sum+=A[i][c];
                check(sum);
            }

            k++ ;
        }
    }

    static void check(int sum){
        if(isSquare(sum))
            score++ ;
    }

    static boolean isSquare(int x){
        float y=(float) Math.sqrt(x) ;
        int z = (int) y ;
        if(z==y)
            return true ;

        return false ;
    }

    static void printMatrix(int[][] A , int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0;j<n;j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

}
