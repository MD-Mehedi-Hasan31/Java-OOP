/*
 It has two Implementation;
 1.Linked List
 2. PriorityQueue

 The method  of the Queue is:
 peek()
 boolean add();
 boolean offer(E e);
 E remove();
 E poll();
* */

package com.pondit.CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args){
      /*  Queue<Integer> queue= new LinkedList<>();

        for(int  i=10; i>=0; i--){
            queue.add(i);
        }
        queue.offer(52);

        while (!queue.isEmpty()){
            Integer poll= queue.poll();
            doSomeWork(poll);
        }

        System.out.println(queue.element());    // While we peek the queue in the poll now its empty,
                                                // so it will show an exception
        System.out.println(queue);              // it will show a null value; not exception.

        queue.remove();*/


        Queue<Person> persons = new PriorityQueue<>();

        persons.offer(new Person("Person 1",14));
        persons.offer(new Person("Person 2",35));
        persons.offer(new Person("Person 3",15));
        persons.offer(new Person("Person 4",12));

        Person aPerson1= new Person("Person 5",45);
        Person aPerson2= new Person("Person 6", 78);

        persons.add(aPerson1);
        while (!persons.isEmpty()){
            Person person= persons.poll();
            serve(person);
        }

    }

    private static void serve(Person person){
        System.out.println("Serving Person - name: "+person.getName()+", age: "+person.getAge());
    }

    private static void doSomeWork(Integer value){
        System.out.println("doing some work with: "+value);
    }
}

