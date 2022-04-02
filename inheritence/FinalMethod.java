package com.pondit.inheritence;

public class FinalMethod {

    private long amount;

    public final void  deposite(long amount){
        this.amount += amount;
    }

    public long getAmount(){
        return amount;
    }

}
