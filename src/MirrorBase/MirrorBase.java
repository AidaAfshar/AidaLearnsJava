package MirrorBase;

import java.util.Scanner;

public class MirrorBase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt() ;
        int b = scanner.nextInt() ;
        int c = scanner.nextInt() ;

        int y = toBase10(a,b) ;
        int x = fromBase10(y,c) ;

        if(isPalindrome(x))
            System.out.println("YES");
        else
            System.out.println("NO");


    }

    static boolean isPalindrome(int x){
        String s = String.valueOf(x) ;
        for(int i=0 ; i< s.length() ; i++){
            if(! (s.charAt(i)==s.charAt(s.length()-i-1)))
                return false ;
        }
        return true ;
    }

    static int toBase10(int a , int b){
        int x = a ;
        int y = 0 ;
        int i=0 ;
        while (x!=0){
            int pow =(int) Math.pow(b,i);
            y += (x%10)*pow ;
            x=x/10 ;
            i++ ;
        }
        return y ;
    }

    static int fromBase10(int x , int c){
        String s = new String() ;
        while(x!=0){
            int y = x%c ;
            s+=y ;
            x/=c ;
        }
        String inverse = new String() ;

        for(int i=s.length()-1 ; i>=0 ; i--)
            inverse+=s.charAt(i) ;

        return Integer.valueOf(inverse) ;
    }

}
