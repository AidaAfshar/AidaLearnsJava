package pythagoras;

import java.util.Scanner;

public class Pythagoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ;j++){
                if(isPythagoras(i,j,n)){
                    print(i, j, n);
                    System.exit(0);
                }
            }
        }

        System.out.print("Impossible");

    }

    static void print(int x , int y , int n){
        int z = n-x-y ;
        int [] A = {x,y,z} ;
        for(int i=0 ; i<2 ; i++){
            if(A[i]>A[i+1]) {
                int temp = A[i+1] ;
                A[i+1] = A[i] ;
                A[i] = temp ;
            }


        }

        System .out.print(A[0]+" ");
        System .out.print(A[1]+" ");
        System .out.print(A[2]+" ");

    }


    static int findMin(int... x){
        int min = x[0] ;
        int minIndex = 0 ;
        for(int i=0 ; i<x.length ; i++){
            if(x[i]<min)
                min = x[i] ;
                minIndex = i ;
        }

        return minIndex ;
    }

    static boolean isPythagoras(int x , int y , int n){
        int z = n-x-y ;
        int a =(int)( Math.pow(x,2) + Math.pow(y,2) - Math.pow(z,2) );
        if(a==0)
            return true ;
        return false ;
    }

}
