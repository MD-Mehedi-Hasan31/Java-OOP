package com.pondit.Generics;

public class GenericMethod<K, V> {

    private K key;
    private V value;

    public GenericMethod(K key, V value){

          this.key= key;
          this.value=value;
    }
    
    /*public static  <K, V> boolean compare(Integer<K, V> p1, Integer<K,V> p2){

        return p1.getKey().equals(p2.getKey()) && p1.getValue.equals(p2.getValue());
    }*/
}
