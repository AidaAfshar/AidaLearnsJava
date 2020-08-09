package giftParty;

public class Guest {

    private String name ;
    private int initialMoney ;
    private int money = 0 ;
    private Guest[] list ;

    Guest(String name) {
        this.name=name;
    }


    void initialize(){
      int k= list.length ;
      if(k>0){
          int sharedMoney=initialMoney/k;
          int remainedMoney = initialMoney%k ;
          shareMoney(sharedMoney);
          money += remainedMoney ;
      }
    }


    void shareMoney(int sharedMoney){
        for(int i=0 ; i<list.length ; i++)
            list[i].increaseMoney(sharedMoney);
    }

    void increaseMoney(int money){
        this.money+=money ;
    }

    void print(){
        System.out.println(name+" "+(money-initialMoney)) ;
    }

    void setInitialMoney(int money) {
        this.initialMoney=money;
    }

    void setList(Guest[] list) {
        this.list=list;
    }

    String getName() {
        return name;
    }
}
