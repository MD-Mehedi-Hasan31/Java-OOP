package com.pondit.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

        Map<Student, String> studentList= new HashMap<>();

        Student aStudent1= new Student("Mehedi ");
        Student aStudent2= new Student("Mehedi");
        Student aStudent3= new Student("Hasan");
        Student aStudent4= new Student("Sakib");
        Student aStudent5= new Student("Rakib");

        studentList.put(aStudent1, "12345");
        studentList.put(aStudent2,"58642");
        studentList.put(aStudent3,"2345");
        studentList.put(aStudent4,"58687");
        studentList.put(aStudent5,"86975");

        int size= studentList.size();
        System.out.println("Size of the Student List Is "+size);

        for(Map.Entry<Student, String> entry: studentList.entrySet()){
        System.out.println(entry.getKey().toString()+" - "+entry.getValue());
        }
            // while we want  to remove  any value from the list than here need  to use remove() function;

        studentList.remove(aStudent2);
        System.out.println("After remove on element  from the  list, Now: ");

        for(Map.Entry<Student, String> entry: studentList.entrySet()){
            System.out.println(entry.getKey().toString()+" - "+entry.getValue());
        }

        // containsKey is return boolean, value  is available or not. But this function check by key.
        boolean isExistKey= studentList.containsKey(aStudent1);
        boolean isExistValue= studentList.containsValue("2345");

        if(isExistValue){
            System.out.println("The  value is available here ");
        }
        else{
            System.out.println("The value is not available  here");
        }


        int mapSize= studentList.size();

        System.out.println("The Size of The  Student List Is: "+mapSize);


        /*
        System.out.println("=================================================");

        for(Map.Entry<Student, String> entry: studentList.entrySet()){
            System.out.println(entry.getKey().toString()+" - "+entry.hashCode());
        }*/

    }
}
