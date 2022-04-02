package com.pondit.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardArguments {


    public  static  void printList(List<?> lst){

        for (Object o: lst){
            System.out.println(o);
        }
    }
    public static void main(String[]  args){

        //ArrayList<Object> lst= new ArrayList<String>();
        /*List<String> strList= new ArrayList<String>();
        List<Object> onjList= strList;*/


        List<Object> objList= new ArrayList<>();



        objList.add(new Integer(55));
        objList.add(new Integer(60));

        printList(objList);


        List<String> strLst= new ArrayList<String>();
        strLst.add("One");
      //  strLst.add("Two");
        printList(strLst);


    }
}


