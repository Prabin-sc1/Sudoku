package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private final int DEFAULT_SIZE = 10;
    protected int top = -1;

    public CustomStack (){
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack (int size){
        this.data = new int[size];
    }

    public void push (int n){
//        if(top == data.length-1) {
//            this.data[++top] = n; // assign and increment //pre-increment
//        } else{
//            System.out.println("Stack is full");
//        }
        if (isFull()){
            System.out.println("Stack overflow");
            return;
        }
        this.data[++top] = n;
    }
    public boolean isFull(){
        return top == this.data.length - 1;
//        if (top == data.length - 1){
//            return true;
//        }else{
//            return false;
//        }
    }
    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return null;
        }
        return this.data[top--];

    }

    private boolean isEmpty() {
        return top == -1;
    }
    public Integer peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return this.data[top];

    }

//    public static void main(String[] args) {
//        CustomStack customStack = new CustomStack();
//        customStack.push(5);
//        customStack.push(8);
//        customStack.push(9);
//
//        customStack.pop();
//        System.out.println(customStack.peek());
//    }

}
