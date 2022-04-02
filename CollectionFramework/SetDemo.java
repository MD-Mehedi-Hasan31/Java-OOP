package com.pondit.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args){
        //HashSetExample
        Set<String> cities = new HashSet<>();

        //add() method.
        cities.add("Chittagong");
                cities.add("Dhaka");
                cities.add("Khulna");
                cities.add("Cox's Bazar");
               cities.add("Dhaka");
        System.out.println("List of the Hashset  value is: "+cities);

        // remove() method
                cities.remove("Khulna");
        System.out.println("The  value after removing one element: "+cities);
        //size() method.
        System.out.println("Size of the HashSet is: "+ cities.size());

            //LinkedHashset

        Set<String> stdName= new LinkedHashSet<>();
        stdName.add("Mehedi");
        stdName.add("Sakib");
        stdName.add("Chowdhury");
        stdName.add("Mahabub");

        System.out.println("List  of the Student Name is: "+stdName);
        System.out.println("Size of the  Student List Is: "+stdName.size());
        stdName.remove("Chowdhury");
        System.out.println("List  of the Student Name is: "+stdName);

    // Treeset

        Set<Integer> numbers= new TreeSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);

        System.out.println("TreeSet number  list is: "+numbers);

    }
}
