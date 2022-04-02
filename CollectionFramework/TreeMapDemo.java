package com.pondit.CollectionFramework;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args){
         Map<Student, String> studentListM= new TreeMap<>();
         Student aStudent= new Student("Ety");
         Student aStudent1= new Student("Sumi");
         Student aStudent2= new Student("Sakib");

         studentListM.put(aStudent, "12345");
         studentListM.put(aStudent2,"78945");
        studentListM.put(aStudent1, "1234568");

         for (Map.Entry<Student, String> entry: studentListM.entrySet()){
             System.out.println(entry.getKey().toString()+" - "+entry.getValue());
         }

    }
}
