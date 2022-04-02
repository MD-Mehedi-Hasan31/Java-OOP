package com.pondit.inheritence;

public class AdvanceCalculator extends  Calculator{

        @Override
        public Integer add(Integer a, Integer b){
            if(a==null || b==null){
                System.out.println("Argument  Can't be  null");
                return 0;
            }
            return a+b;
        }
}
