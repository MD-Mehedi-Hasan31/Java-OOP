package com.pondit.Generics;

public class Container <T>{
    private static final int MAX_LENGTH=10;
    private T[] items;
    private int currentIndex=0;

    public Container(){
        items =(T[]) new Object[MAX_LENGTH];
    }

    public void addItem(T item){
        if (currentIndex<MAX_LENGTH) {
            items[currentIndex++]=item;
        }
        else{
            System.out.println("Container is full");
        }
    }

    public T getItem(int index){
        if(index>MAX_LENGTH){
            throw new IllegalArgumentException("Index can not be larger than max");
        }
        return items[index];
    }
    public void printAll(){
        for(int i=0; i<currentIndex; i++){
            System.out.println(items[i]+", ");
        }
    }
    public static void main(String[] args){
        Container<Integer> container= new Container<Integer>();
        container.addItem(1);
        container.addItem(2);
        container.addItem(3);
        container.addItem(4);
        container.addItem(5);
        container.addItem(6);
        container.addItem(7);
        container.addItem(8);
        container.addItem(9);
        container.addItem(10);
        container.addItem(11);


        container.printAll();

    container.getItem(container.currentIndex);
    /*
        System.out.println("The amount of the value is: "+a);
       */
    }
 }
