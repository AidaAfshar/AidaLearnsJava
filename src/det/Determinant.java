package det;

import java.util.Scanner;

public class Determinant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        float[][] A = new float[n][n] ;
        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++)
                A[i][j] = scanner.nextFloat() ;

        float det = det(A,n) ;
        String ans= String.format("%.2f",det) ;
        System.out.println(ans);


        scanner.close();


    }

    static float det(float[][] A, int n){
        float det = 0 ;
        if(n==1)
            return A[0][0] ;
        else if(n==2)
            return (float) ((1.0)*A[0][0]*A[1][1]-(1.0)*A[0][1]*A[1][0]);
        else{
            for(int i=0;i<n;i++){
                int co=(int) Math.pow(-1, i);
                det+=(co)*A[0][i]*det(minor(A, n, 0, i), n - 1);

            }
        }
        return det ;
    }

    static float[][] minor(float[][] A, int n,int row , int column){
        float[][] Minor = new float[n-1][n-1] ;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-1 ; j++){
                int r = i ;
                int c = j ;
                if(i>=row)
                    r= i+1 ;
                if(j>=column)
                    c = j+1 ;
                Minor[i][j] = A[r][c] ;
            }
        }

        return Minor ;
    }


    static void printMatrix(float[][] A , int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
