package com.pondit.CollectionFramework;

import java.util.Stack;

/*
  It has Four Method:
  push()
  pop()
  peek()
  empty()

 */
public class StackDemo {

    public static void main(String[] args){

        Stack<Integer> numberList= new Stack<>();

            numberList.push(10);
            numberList.push(20);
            numberList.push(30);
            numberList.push(40);
            numberList.push(50);

        //System.out.println(numberList.peek());
        System.out.println(numberList.pop());
        System.out.println(numberList.peek());
        System.out.println(numberList.empty());
    }
}
