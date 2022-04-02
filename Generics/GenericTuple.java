package com.pondit.Generics;

public class GenericTuple<X,Y> {

    private X x;
    private Y y;

    public GenericTuple(X x, Y y){
        this.x=x;
        this.y=y;
    }

    public X getX(){
        return x;
    }

    public Y getY(){
        return y;
    }

    public void showTypes(){
        System.out.println("types of X is: "+x.getClass().getName());
        System.out.println("types of Y is: "+y.getClass().getName());

    }
    public static void  main(String [] args){
        GenericTuple<String,String> genericTuple = new GenericTuple<>("Hello","Mehedi");
                        genericTuple.showTypes();
       String x_value=genericTuple.getX();
       String y_value=genericTuple.getY();

        System.out.println("The value of the X is: "+x_value);
        System.out.println("The value of the Y is: "+y_value);
    }
}
