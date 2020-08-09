package giftParty;

import java.util.Scanner;

public class GiftParty {

    public static void main(String[] args) {


        //Input:

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        scanner.nextLine() ;
        Guest[] guests = new Guest[n] ;
        for(int i=0 ; i< n ; i++){
            String name = scanner.nextLine() ;
            guests[i]=new Guest(name);
        }

        for(int i=0 ; i<n ; i++){
            String gustName = scanner.nextLine() ;
            Guest guest = getGuest(gustName,guests) ;
            int money = scanner.nextInt() ;
            guest.setInitialMoney(money);
            int k = scanner.nextInt() ;
            Guest[] list = new Guest[k] ;
            scanner.nextLine() ;
            for(int j=0 ; j<k ; j++){
                String name = scanner.nextLine() ;
                list[j]=getGuest(name, guests);
            }
            guest.setList(list);

        }


        //main Operation
            for(Guest guest:guests)
                guest.initialize();


        //Output
            for(Guest guest:guests)
                guest.print();



    }

    static Guest getGuest(String name, Guest[] guests){
        for(Guest guest : guests)
            if(guest.getName().equals(name))
                return guest ;

        return null ;
    }

}
