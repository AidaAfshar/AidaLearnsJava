package sigmaGir;

import java.util.Scanner;

public class SigmaGir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        int m = scanner.nextInt() ;

        int ans = calculateFormula(n,m) ;
        System.out.println(ans);


    }

    static int calculateFormula(int n , int m){
        int ans = 0 ;
        for(int i=-10 ; i<=m ; i++)
            for(int j=1 ; j<=n ; j++){
                int soorat = (int)Math.pow(i+j,3) ;
                int makhraj = (int)Math.pow(j,2) ;
                ans+=soorat/makhraj ;
            }

        return ans ;
    }
}
