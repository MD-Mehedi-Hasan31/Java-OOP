package com.pondit.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {


    public static void main(String[] args){

        List<String> personName= new ArrayList<>();

        //add(); method
        personName.add("Mehedi");
         personName.add("Sakib");
         personName.add("Rahim");
         personName.add("Karim");
        System.out.println(personName);
        System.out.println();

        //size(); method
        System.out.println(personName.size());

        /*Here we convert from Array to arrayList */
        String[] subjectName={"Math","Physics","English"};
        List<String> subName= new ArrayList<>();
        for (String name:subjectName){
            subName.add(name);
        }
        System.out.println(subName);

        // get(int index); method
        String indexValue=personName.get(3);
        System.out.println("third value of the list is that: "+indexValue);

        // set(int index, element);
        personName.set(2,"Ruman");
        System.out.println("Update list is that: "+personName);

        //remove(int index);
        personName.remove(3);
        System.out.println("After remove value the list is: "+personName);
        // remove("");
        personName.remove("Ruman");
        System.out.println(personName);

        //add() Here  add duplicate value
        personName.add("Mehedi");
        personName.add("Rakib");
        personName.add("Ruma");
        System.out.println(personName);

        // indexOf(); mehtod
        int indexOfRakib= personName.indexOf("Rakib");
        System.out.println("Index value of the rakib is: "+indexOfRakib);

        //lastIndexOf();
        int lastIndexOfMehedi=personName.lastIndexOf("Mehedi");
        System.out.println("Last index of the mehedi is: "+ lastIndexOfMehedi);
    }
}
