package com.pondit.Generics;

public class BoundedTypes<T extends Number>{

    T[] nums;

    public  BoundedTypes(T[] nums){
        this.nums=nums;
    }

    double average(){
        double  sum=0.0;
        for (T num: nums){
            sum+=num.doubleValue();
        }
        return sum/ nums.length;
    }
}
