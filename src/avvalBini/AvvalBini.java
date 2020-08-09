package avvalBini;

import java.util.ArrayList;
import java.util.Scanner;

public class AvvalBini {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt() ;
        int b = scanner.nextInt() ;
        ArrayList<Integer> list = new ArrayList<>() ;


        int x=a+1 ;
        while(x<b){
            if(isPrime(x))
                list.add(x);
            x++ ;
        }

        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i));
            if(i!= list.size()-1)
                System.out.print(",");
        }
    }

    static boolean isPrime(int x){
        int y = (int) Math.sqrt(x) ;
        for(int i=y ; i>1 ; i--)
            if(x%i==0)
                return false ;

        return true ;
    }

}
