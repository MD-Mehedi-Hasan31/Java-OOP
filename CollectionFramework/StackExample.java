package com.pondit.CollectionFramework;


import java.util.Stack;

/*
    Here will find th bracket is balanced or not. Will pass string value,
    it will convert to the character,
 */
public class StackExample {


    public  static boolean isBalancedBrackets(String expression){

        Stack<Character> stack = new Stack<>();

        char[] chars= expression.toCharArray();

        for (char aChar : chars){
            if (stack.empty()){
                stack.push(aChar);
            }
            else{

                char peek= stack.peek();
                if(peek=='(' && aChar==')'){
                    stack.pop();
                }
                else  if(peek=='{' && aChar=='}'){
                    stack.pop();
                }
                else if(peek =='[' && aChar==']'){
                    stack.pop();
                }
                else {
                    stack.push(aChar);
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args){
            String[] brackets={"(()){}()"}; //,"({})","({}(","){})"

            for (String exp: brackets){
                String isBalanced = isBalancedBrackets(exp) ? "Balanced" : "Not Balanced";
                System.out.println(exp+" is"+ isBalanced);
            }
    }
}
