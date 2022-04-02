package com.pondit.CollectionFramework;

import java.util.List;
import java.util.Vector;

public class VectorDemo{

    public static void main(String[] args){

        List<String> studentName= new Vector<>();

        // add(); method
        studentName.add("Mohim");
        studentName.add("Rahim");
        studentName.add("Ala Uddin");
        studentName.add("Mehedi");
        System.out.println(studentName);

        //size();
        System.out.println(studentName.size());

        String[] teacherName={"Afsar","Abul khalam","Sisir"};
        List<String> teacherNameList= new Vector<>();
        for (String name:teacherName){
            teacherNameList.add(name);
        }
        System.out.println("Convert List  is: "+teacherNameList);

        // get(int index); method
        String stdName= studentName.get(3);
        System.out.println("Fourth value of the list is that: "+stdName);

        // set(int index, element); method;
        studentName.set(2,"Sonjoy");
        System.out.println("Update List  is: "+studentName);

        // remove(int index); remove element form list using int  index;
        studentName.remove(3);
        System.out.println("After remove third  element from the list: "+studentName);
        // remove(String); remove element using strung value;
        studentName.remove("Mohim");
        System.out.println(studentName);

        // add(); value
        studentName.add("Mohim");
        studentName.add("Mehedi");
        studentName.add("Mohim");
        System.out.println(studentName);

        // indexOf();
        int indexOfMohim= studentName.indexOf("Mohim");
        System.out.println("The index of the Mohim is: "+ indexOfMohim);

        // lastIndexOf(); method
        int lastIndexOfMohim= studentName.lastIndexOf("Mohim");
        System.out.println("Latst Index of Mohim: "+lastIndexOfMohim);

    }
}
