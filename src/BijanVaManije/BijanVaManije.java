package BijanVaManije;

import java.util.Scanner;

public class BijanVaManije {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        float x1 = scanner.nextFloat() ;
        float x2 = scanner.nextFloat() ;
        float y1 = scanner.nextFloat() ;
        float y2 = scanner.nextFloat() ;
        float ab = scanner.nextFloat() ;
        float bb = scanner.nextFloat() ;
        float cb = scanner.nextFloat() ;
        float am = scanner.nextFloat() ;
        float bm = scanner.nextFloat() ;
        float cm = scanner.nextFloat() ;


        x1 = setLowerBound(x1) ;
        x2 = setUpperBound(x2) ;
        y1 = setLowerBound(y1) ;
        y2 = setUpperBound(y2) ;

        int b = getCountOfPairs(x1,x2,y1,y2,ab,bb,cb) ;

        int m = getCountOfPairs(x1,x2,y1,y2,am,bm,cm) ;
        announceTheWinner(b,m);

    }


    static int getCountOfPairs(float x1,float x2, float y1 , float y2 , float a , float b , float c){
        int count = 0 ;
        float x = x1 ;
        while(x<=x2){
            float y = y1 ;
            while(y<=y2){
                if(calculateFormula((int)x,(int)y,a,b,c))
                    count ++ ;
                y++ ;
            }
            x++ ;
        }
        return count ;
    }


    static boolean calculateFormula(float x , float y , float a , float b , float c){
        float z = a*x;
        z+=b*y ;
        z+=c ;
        if(Math.abs(z)<0.00001)
            return true ;
        return false ;
    }

    static int setLowerBound(float z){
        return (int) Math.floor(z)+1 ;
    }

    static int setUpperBound(float z){
        if(z!=Math.floor(z))
            z=(float)Math.floor(z) ;
        else z = z-1 ;
        return (int) z ;
    }

    static void announceTheWinner(int b , int m){
        System.out.println(b);
        System.out.println(m);


        if(b>m){
            System.out.println("bizhan won");
        }
        else if (m>b)
            System.out.println("manizhe won");
        else
            System.out.println("Tie");

    }
}
