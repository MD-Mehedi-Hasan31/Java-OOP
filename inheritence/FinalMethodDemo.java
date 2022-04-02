package com.pondit.inheritence;

public class FinalMethodDemo extends FinalMethod {

    private long amount;


  /*  @Override
    public final void deposite(long amount){

        this.amount= amount;
    }*/

    @Override
    public long getAmount(){
        return amount;
    }
}
