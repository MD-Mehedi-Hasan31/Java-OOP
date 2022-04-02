package com.pondit.Generics;

public class Generic<T>{

    private T obj;
    public Generic(T obj){
        this.obj=obj;
    }
    public T getObj()
    {
        return obj;
    }
    public void showType(){
        System.out.println("Type of T is: "+ obj.getClass().getName());
    }
}

class GenericClassTest{

    public static void main(String[] args){

        // For Integer

      /*  Generic<Integer> iobj;
        iobj = new Generic<Integer>(88);
        iobj.showType();
        int v= iobj.getObj();
        System.out.println("Value Is: "+v);

        // For String
        Generic<String> iobj1;

        iobj1 = new Generic<String>("Hello this is the Md Mehedi Hasan");
        iobj1.showType();
        String details= iobj1.getObj();
        System.out.println("The value is: "+details);*/

        Person aPersonDetails= new Person();
        aPersonDetails.firstName="Md ";
        aPersonDetails.middleName="Mehedi ";
        aPersonDetails.lastName="Hasan";
        aPersonDetails.address="Oxygen, Chittagong, Banglades";

        Generic<Person> aPerson;
        aPerson =  new Generic<>(aPersonDetails);

        aPerson.showType();
        System.out.println("------------------------------------------------");
        Person personDetails=aPerson.getObj();
        System.out.println("The Details Of the Person Is: "+personDetails.detailsPerson());
    }
}

class Person{
    
    public String firstName;
    public String middleName;
    public  String lastName;
    public  String address;

    public String detailsPerson(){
        return firstName+" "+middleName+" "+lastName+" "+address;
    }
}