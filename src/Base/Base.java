package Base;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in) ;
    int a = scanner.nextInt() ;
    int b = scanner.nextInt() ;
    String s = String.valueOf(fromBase10(a,b)) ;


    int sum1 = 0 ;
    int sum2 = 0 ;

    for(int i=0 ; i<s.length() ; i++){
        if(i%2==0)
            sum1+=Integer.valueOf(s.charAt(i)-48) ;
        else
            sum2+=Integer.valueOf(s.charAt(i)-48) ;
    }
        if(sum1==sum2)
            System.out.println("Yes");
        else
            System.out.println("No");

    }


    static int toBase10(int x , int b){
        int i=0 ;
        int y = 0 ;
        while(x!=0){
            int c = (int)Math.pow(b,i) ;
            y+=(x%10)*c ;
            x/=10;
            i++ ;
        }
        return y ;
    }



    static int fromBase10(int x , int b){
        int countOfDigits = (int)(((1.0)*(Math.log(x))/Math.log(b))+1) ;
        int y=0 ;
        for(int i=0 ; i<=countOfDigits ; i++){
            int z = x%b ;
            y+= z*Math.pow(10,i) ;
            x/=b ;
        }

        return y ;
    }

}
