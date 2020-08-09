package set;

import java.util.Scanner;

public class AllSubsets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;

        System.out.println("{}");

        if(n != 0)
            function(new int[] {1}, n) ;

    }

    static void function(int[] array , int n){

        print(array);


        if(array[array.length-1] == n){

            return ;

        }else{

            int[] addedArray = produceAddedArray(array) ;
            function(addedArray,n);

        }

        int [] nextArray = produceNextArray(array) ;
        function(nextArray,n);

    }



    static int[] produceNextArray(int[] array){

        array[array.length-1] += 1 ;
        return array ;

    }

    static int[] produceAddedArray(int[] array){

        int[] tempArray = new int[array.length + 1] ;
        for(int i=0 ; i<array.length ; i++)
            tempArray[i] = array[i] ;

        tempArray[tempArray.length - 1] = array[array.length-1] + 1 ;

        return tempArray ;
    }

    static void print(int[] array){

        System.out.print('{');
        for(int i=0 ; i<array.length ; i++){
            System.out.print(array[i]) ;
            if(i != array.length-1)
                System.out.print(", ") ;
        }
        System.out.println('}');

    }

}

