package com.pondit.CollectionFramework;

import java.util.*;

public class ConversionCollection{

    public static void main(String[] args){
        // Conversion From Array to List;
        List<Integer> list1= Arrays.asList(0,1,2,3,4,5);
        System.out.println(list1);
        List<String> nameList= Arrays.asList("Mehedi","Sakib","Kabila","Ety");
        System.out.println(nameList);


        // Conversion From List ot  Array
        List<Integer> sourceList= new ArrayList<>();
            sourceList.add(10);
            sourceList.add(20);
            sourceList.add(30);
            sourceList.add(40);

        Integer[] targetArray= sourceList.toArray(new Integer[sourceList.size()]);

        for (int i=0; i< sourceList.size();i++){
            System.out.println(targetArray[i]);
        }

        List<String> nameArray= new ArrayList<>();
        nameArray.add("CSE");
        nameArray.add("BBA");
        nameArray.add("LLB");
        nameArray.add("English");

        String[] targetArray2= nameArray.toArray(new String[nameArray.size()]);

        for (int j=0;j<nameArray.size();j++){
            System.out.println(targetArray2[j]);
        }

        System.out.println("=============================");


        // Conversion from list to set;
        List<String> sourceList1= new ArrayList<>();
        sourceList1.add("Bangladesh");
        sourceList1.add("India");
        sourceList1.add("Nepal");
        sourceList1.add("Pakistan");
        Set<String> targetSet= new HashSet<>(sourceList1);
        System.out.println(targetSet);

        // Conversion from Set to List;

        Set<Integer> numberList= new HashSet<>();
         numberList.add(1);
         numberList.add(2);
         numberList.add(3);
         numberList.add(4);

         List<Integer> targetLIst = new ArrayList<>(numberList);
        System.out.println(targetLIst);
    }
}
