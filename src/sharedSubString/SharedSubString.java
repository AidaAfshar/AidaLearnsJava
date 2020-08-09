package sharedSubString;

import java.util.Scanner;

public class SharedSubString {

    //TODO : not Done!

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        String[] strings = new String[n] ;
        scanner.nextLine() ;
        for(int i=0 ; i<n ; i++)
            strings[i]= scanner.nextLine();


        String shared = strings[0] ;
        for(int i=1 ; i<n ; i++)
            shared = getSharedSubString(strings[i],shared) ;


        System.out.println(shared);

    }

    static String getSharedSubString(String s1 , String s2){
        if(s1.length()<s2.length()){
            String temp = s1 ;
            s1 = s2 ;
            s2 = temp ;
        }


        String straight = findShared(s1 , s2) ;
        String inverse = findShared(s1 , inverse(s2)) ;

        if(!straight.equals("") && !inverse.equals(""))
            if(straight.length()>inverse.length())
                return straight ;
        else if(straight.equals("") && !inverse.equals(""))
            return inverse(inverse) ;
        else if(!straight.equals("") && inverse.equals(""))
            return straight ;

        return inverse(inverse) ;
    }

    static String findShared(String s1 , String s2){
        String shared = new String() ;
        for(int i=0 ; i<s1.length() ; i++){
            String temp = new String() ;
            for(int j=0 ; j< s2.length() ; j++){
                if(i+j<s1.length())
                    if(s1.charAt(i+j)==s2.charAt(j))
                        temp+=s2.charAt(j) ;
                    else break;
                else break;
            }
            if(temp.length()>shared.length())
                shared=temp;

        }

        return shared ;
    }

    static String inverse(String s){
        String t = new String() ;
        if(!s.equals(""))
            for(int i=s.length()-1 ; i>=0 ; i--)
                t+=s.charAt(i) ;

        return t ;
    }


}
