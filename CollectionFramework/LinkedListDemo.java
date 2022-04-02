package com.pondit.CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args){
        LinkedList<String> name= new LinkedList<>();
        name.add("Md Mehedi Hasan");
        name.add("Md Rakib Hasan");
        name.add("Md Ala Uddin");
        name.add(2,"Mehedi Chowdhury");
        name.addFirst("Hasan Mehedi");
        name.addLast("Kabila Uddin");

        System.out.println(name);
        name.clear();
        System.out.println("The  Student List is: "+name);

     /*   int i=1;
        for (String nm: name){
            System.out.println("Name Of the student no "+i+"st is: "+nm);
            i++;
        }
*/  

        /*
        Person aPerson= new Person();
        aPerson.studentName="Md Mehedi Hasan";
        aPerson.id=101196;
        aPerson.studentAddres="205/a";

        Person bPerson= new Person();
        bPerson.studentName="Md Kabila";
        aPerson.id=101193;
        aPerson.studentAddres="105/a";

        Person cPerson= new Person();
        cPerson.studentName="Md Mahabub";
        cPerson.id=101140;
        cPerson.studentAddres="2a/a";

        Person dPerson= new Person();
        dPerson.studentName="Md Santo";
        dPerson.id=1011500;
        dPerson.studentAddres="x/a";


        LinkedList<Person> personLint= new LinkedList<>();

        personLint.add(aPerson);
        personLint.add(bPerson);
        personLint.add(cPerson);
        personLint.add(dPerson);
        int f=1;
        for (Person prsn: personLint){
            System.out.println(f+"st Student Name "+prsn.studentName+
                            " Student Id: "+prsn.id+" Address: "+prsn.studentAddres);
            f++;
        }*/
    }
}
