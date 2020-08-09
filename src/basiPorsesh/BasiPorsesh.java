package basiPorsesh;

import java.util.Scanner;

public class BasiPorsesh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        int q = scanner.nextInt() ;
        int[] A = new int[n] ;
        for(int i=0 ; i<n ; i++)
            A[i] = scanner.nextInt() ;

        int[] R = new int[q] ;
        int[] Q = new int[q] ;

        for(int i=0 ; i<q ; i++){
            R[i] = scanner.nextInt() ;
            int j = isRepetitive(R,R[i],i) ;
            if(j!=-1)
                Q[i]=Q[j] ;
            else
                Q[i]=calculate(A, R[i]);
        }


        for(int i=0 ; i<q ; i++)
            System.out.println(Q[i]);


        scanner.close();

    }

    static int isRepetitive(int[] R,int r, int i){
        for(int j=0 ; j<i ; j++)
            if(R[j]==r)
                return j ;

        return -1 ;
    }

    static int calculate(int[] A , int r){
        int ans = 0 ;
        for(int j=0 ; j<r ; j++){
            ans += (A[j]^(r-(j+1))) ;
        }
        return ans ;
    }

}
