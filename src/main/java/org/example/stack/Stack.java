package org.example.stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if(top == 5){
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }
    public void show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public int pop(){
        int data =0;
        if(isEmpty()){
            System.out.println("The stack is empty ");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
            return data;

    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public void size(){
         System.out.println("The size is : "+top);
    }
    public boolean isEmpty(){
        return top <= 0;
    }


}
