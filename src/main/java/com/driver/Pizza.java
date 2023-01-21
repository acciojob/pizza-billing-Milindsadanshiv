package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int cheese;
    int toppings;
    boolean extraCheeseAdded;
    boolean extraToppingsAdded;
    boolean isBillGenerated;
    boolean isTakeAway;
    int isTake;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
      if (isVeg)
      {
          this.price=300;
          this.cheese=80;
          this.toppings=70;
      }else
      {
          this.price=400;
          this.cheese=80;
          this.toppings=120;
      }
     this.isTake=20;
      this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
         if (!extraCheeseAdded)
         {
             this.price+=cheese;
             extraCheeseAdded=true;
         }
    }

    public void addExtraToppings(){
        // your code goes here
        if (! extraToppingsAdded)
        {
            this.price+=toppings;
            extraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
       if (!isTakeAway)
       {
           this.price+=isTake;
           isTakeAway=true;
       }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated)
        {
            if (extraCheeseAdded)
            {
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            }
            if (extraToppingsAdded)
            {
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAway)
            {
                this.bill+="Paperbag Added: "+this.isTake+"\n";
            }
            this.bill+= "Total Price: "+this.price +"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
