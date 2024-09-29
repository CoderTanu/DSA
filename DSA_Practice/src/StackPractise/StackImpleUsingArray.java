package StackPractise;

import java.util.Stack;

public class StackImpleUsingArray {
   
	
	
	public static void main(String[] args) {
		
		stack stack = new stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(4);
		stack.push(6);
		
		System.out.println(stack);
		
		//pop(delete the element)
		
		System.out.println(stack.pop());
		
		//top
		System.out.println(stack.top());
		
		//
		
		System.out.println(stack.size());
		
		System.out.println(stack.empty());
		
	}	

}
	
	class stack{
		int size=10000;
		int arr[] = new int[size];
		int top = -1;
		
		//push
		void push(int x) {
			top++;
			arr[top]=x;
		}
		
		//pop
		int pop(){
			int x=arr[top];
			top--;
			return x;
			
		}
		
		//top
		int top() {
			return arr[top];
		}
		
		int size(){
			return top+1;
		}
		
		boolean empty(){
			return(top == -1);
		}
		
		
	}
