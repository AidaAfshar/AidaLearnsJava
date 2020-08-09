package sharifiNumbers;

import java.util.Scanner;

public class sharifiNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        int[] A = new int[n] ;
        for(int i=0 ; i<n ; i++)
            A[i] = scanner.nextInt() ;

        scanner.close();
        int interval = calculateInterval(A,n) ;

        for(int i=100 ; i<=interval ; i++){
            int countOfDigits = getCountOfDigits(i) ;
            if(isSharifiNumber(i,countOfDigits))
                System.out.println(i);
        }

    }

    static boolean isSharifiNumber(int x , int countOfDigits){
        int y = 0 ;
        int z = x ;
        for(int i=0 ; i<countOfDigits ; i++){
            y+=Math.pow(x%10,countOfDigits) ;
            x/=10 ;
        }
        if(y==z)
            return true ;
        return false ;
    }

    static int calculateInterval(int[] A , int n){
        int interval = 0 ;
        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++)
                if(i!=j)
                    interval += A[i]*A[j] ;


        return interval ;
    }

    static int getCountOfDigits(int x){
        int count =0 ;
        while(x != 0){
            count ++ ;
            x=x/10 ;
        }

        return count ;
    }

}
