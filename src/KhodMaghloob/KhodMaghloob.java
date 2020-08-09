package KhodMaghloob;

import java.util.Scanner;

public class KhodMaghloob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine() ;
        String inverse = new String() ;
        for(int i=s.length()-1 ; i>=0 ;i--)
            inverse+=s.charAt(i) ;

        if(s.equals(inverse))
            System.out.println("YES") ;
        else
            System.out.println("NO");

        scanner.close();

    }
}
