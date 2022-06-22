package com.codedifferently.assessment01.part03;

import java.lang.reflect.GenericArrayType;
import java.util.EmptyStackException;

public class MyStack<T>{
 //   private T arr[];
    private int top;
    private int capacity;
  //  MyStack(int size) {
      //  arr = new T [size];
     //   capacity = size;
     //   top = -1;
   // }

    public boolean isEmpty() {
        return false;
    }

    public void push(T i) {
        if (isEmpty()) {
            System.out.print("Add something");
        }
        top = top + 1;
     //   arr[top] = i;

    }

    public T pop() throws EmptyStackException {
        return null;
    }

    public T peek() { return null; }

    public Integer size(){
        return null;
    }
}
