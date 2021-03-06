package com.techment.task;

import java.util.*;
class Stack{
	
	int[] arr = new int[6];  //stack using array
	int top=-1;        //top of stack
	
	public Stack() {
		arr[0]=-1;     //top of stack is empty
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == (arr.length-1)-1)
			return true;
		else
			return false;
	}
	
	public void push(int item) {
		if(isFull()==true)
			System.out.println("Can't insert, Stack is Full");
		else
			arr[++top]=item;
			
	}

	public int pop() {
		if(isEmpty()==true) {
			System.out.println("Can't pop, Stack is Empty");
			return 0;
		}
		else {
			int item=arr[top];
			top--;
			return item;
		}
	}
}

public class StackImplementationEx41 {
	
	public static void main(String[] args) {  
		int item;
		
		Scanner scanner = new Scanner(System.in);
		Stack s = new Stack();
		
		System.out.println("Enter the stack element");
		for(int i=1;i<6;i++) {
			item=scanner.nextInt();
			s.push(item);
		}
		
		System.out.println("Stack Item pop");
		for(int i=1;i<6;i++) {
			System.out.println("Item popped is: "+s.pop());
		}
	}

}

